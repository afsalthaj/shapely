import scala.language.experimental.macros

package shapely {
  trait ShapelyCompat {
    this: Shapely.type =>

    implicit def genCaseClass[A <: Product, B]: Shapely[A, B] = macro shapely.Macro.genCaseClass[A]
    implicit def genSealedTrait[A, B]: Shapely[A, B] = macro shapely.Macro.genSealedTrait[A]
  }
}

package shapely {
  object Macro {
    import scala.reflect.macros.whitebox.Context

    def genCaseClass[A: c.WeakTypeTag](c: Context): c.Tree = {
      import c.universe._

      val A = c.weakTypeOf[A]

      if (!A.typeSymbol.isClass || !A.typeSymbol.asClass.isCaseClass)
        c.abort(c.enclosingPosition, s"Type ${A.typeSymbol} is not a case class")

      val fields = A.decls.collect { case m: MethodSymbol if m.isCaseAccessor => m.asMethod }.toList

      val result =
        if (fields.isEmpty) {
          val tcons = c.mirror.staticClass(s"_root_.shapely.CaseClass0")
          val B = tq"$tcons[$A]"
          val cons =
            if (A.typeSymbol.isModuleClass) q"${A.termSymbol}"
            else q"${A.typeSymbol.companion}()"
          q"""new _root_.scala.Shapely[$A, $B] {
                override def to(a: $A): $B = ${tcons.companion}()
                override def from(b: $B): $A = $cons
              }"""
        } else {
          val tcons = c.mirror.staticClass(s"_root_.shapely.CaseClass${fields.length}")
          val tparams = fields.map { m => m.typeSignatureIn(A).resultType }
          val labels = fields.map { m => internal.constantType(Constant(m.name.decodedName.toString.trim)) }
          val B = tq"$tcons[$A , ..$tparams, ..$labels]"
          val to_getters = fields.map { f => q"a.${f.name.toTermName}" }
          val from_getters = (1 to fields.length).map { i =>
            val getter = TermName(s"_$i")
            q"b.$getter"
          }

          q"""new _root_.scala.Shapely[$A, $B] {
                override def to(a: $A): $B = ${tcons.companion}(..$to_getters)
                override def from(b: $B): $A = ${A.typeSymbol.companion}(..$from_getters)
              }"""
        }

      //println(result)
      //println(scala.util.Try(c.typecheck(result)))
      result
    }

    def genSealedTrait[A: c.WeakTypeTag](c: Context): c.Tree = {
      import c.universe._

      val A = c.weakTypeOf[A]
      val cls = A.typeSymbol.asClass

      if (!cls.isSealed)
        c.abort(c.enclosingPosition, s"${A.typeSymbol} is not a sealed trait")

      // ordering is ill-defined, we use source ordering
      val parts =
          cls.knownDirectSubclasses.toList
            .map(_.asClass)
            .sortBy(_.pos.start)
            .map { cl =>
              if (cl.isModuleClass)
                internal.thisType(cl)
              else {
                val t    = cl.toType
                val args = t.typeArgs.map { a =>
                  val sym  = a.typeSymbol
                  val tSym = A
                    .find(_.typeSymbol.name == sym.name)
                    .getOrElse(
                      c.abort(
                        c.enclosingPosition,
                        s"type parameters on case classes ($t[${t.typeArgs}]) are not supported unless they are on the sealed trait ($A)"
                      )
                    )
                  a.substituteTypes(List(sym), List(tSym))
                }
                appliedType(t, args)
              }
            }

      val sealedtrait_cls = c.mirror.staticClass(s"_root_.shapely.SealedTrait${parts.length}")
      val sealedtrait = appliedType(sealedtrait_cls, A :: parts) // == B.typeSymbol.asClass

      val to_matchers = parts.zipWithIndex.map {
        case (tp, i) =>
          val cons = c.mirror.staticClass(s"_root_.shapely.SealedTrait._${i + 1}")
          cq"p : $tp => ${cons.companion}.apply(p)"
      }

      val from_matchers = parts.zipWithIndex.map {
        case (_, i) =>
          val uncons = c.mirror.staticClass(s"_root_.shapely.SealedTrait._${i + 1}")
          cq"${uncons.companion}(p) => p"
      }

      val result =
        q"""new _root_.scala.Shapely[$A, $sealedtrait] {
              override def to(a: $A): $sealedtrait = a match { case ..$to_matchers }
              override def from(b: $sealedtrait): $A = b match { case ..$from_matchers }
            }"""

      //println(result)
      //println(scala.util.Try(c.typecheck(result)))
      result
    }
  }
}
