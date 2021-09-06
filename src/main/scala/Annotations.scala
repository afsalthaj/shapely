package shapely

import scala.quoted.*

object Annotations {
  def anns[T: Type, A: Type](ownerName: String)(using Quotes): Expr[List[A]] = {
    import quotes.reflect.*

    val tpe = TypeRepr.of[T]

    Expr.ofList {
      tpe.typeSymbol.annotations.filter { a => {
        a.tpe.typeSymbol.fullName == ownerName
      }}.map(_.asExpr.asInstanceOf[Expr[A]])
    }
  }
}
