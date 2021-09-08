package shapely

import scala.quoted.*


  /**
   * No way. That's wrong. But may be it would work. Good to just get a product of annotations
   * and then Macros.annotationsOf[A].zipWith(Macros.annotationsOf[B]) in inline
   */
  final case class Annotation[A](v: A) {self =>
    def zipWith[B](annotation: Annotation[B]): Annotation[(A, B)] =
      Annotation((self.v, annotation.v))
  }

  object Annotation {
    inline def annotationOf[T, A]: List[(String, List[A])] = ${fieldAnns[T, A]}

    def fieldAnns[T: Type, A: Type](using Quotes): Expr[List[(String, List[A])]] =
      import quotes.reflect.*

      val tpe = TypeRepr.of[T]
      val ann = TypeRepr.of[A]
      val annOwnerName = ann.typeSymbol.fullName

      println(annOwnerName)

      Expr.ofList {
        tpe.typeSymbol.primaryConstructor.paramSymss.flatten.map { field =>
          Expr(field.name) -> field.annotations.filter { a =>
            a.tpe.typeSymbol.fullName == "shapely.ignore"
          }.map(_.asExpr.asInstanceOf[Expr[A]])
        }.filter(_._2.nonEmpty).map { (name, anns) => Expr.ofTuple(name, Expr.ofList(anns)) }
      }
  }
