package shapely

import scala.quoted.*

object Annotations {

  /**
   * A typed list of annotations
   * Allows user to not deal with `isInstanceOf`
   */
  final case class Annotation[A](v: A) {self =>
    def zipWith[B](annotation: Annotation[B]): Annotation[(A, B)] =
      Annotation((self.v, annotation.v))
  }

  object Annotation {
    def anns[T: Type, A: Type](ownerName: String)(using Quotes): Expr[List[A]] = {
      import quotes.reflect.*

      val tpe = TypeRepr.of[T]

      Expr.ofList {
        tpe.typeSymbol.annotations.filter { a => {
          a.tpe.typeSymbol.fullName == ownerName
        }
        }.map(_.asExpr.asInstanceOf[Expr[A]])
      }
    }
  }
}
