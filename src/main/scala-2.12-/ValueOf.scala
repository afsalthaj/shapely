import scala.language.experimental.macros

// backport of ValueOf
package scala {

  @scala.annotation.implicitNotFound(msg = "No singleton value available for ${T}.")
  final class ValueOf[T](val value: T) extends AnyVal
  object ValueOf {
    implicit def gen[A]: ValueOf[A] = macro shapely.ValueOfMacros.gen[A]
  }

}

package shapely {
  object ValueOfMacros {
    import scala.reflect.macros.whitebox.Context

    // TODO support case objects and Int
    def gen[A: c.WeakTypeTag](c: Context): c.Tree = {
      import c.universe._
      val A = c.weakTypeOf[A]
      val result = q"new _root_.scala.ValueOf[$A]($A)"
      // println(result)
      // println(scala.util.Try(c.typecheck(result)))
      result
    }
  }
}
