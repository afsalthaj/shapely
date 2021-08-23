// implicit materialisation of a CaseClassN or SealedTraitN representation of a
// case class or sealed trait, respectively, which are generated.

package scala {
  trait Shapely[A, B] {
    def to(a: A): B
    def from(b: B): A
  }

  object Shapely extends ShapelyCompat {
    def generic[A] = Derived[A]()
    def fieldsOf[A] = FieldsOf[A]()

    final case class Derived[A]() {
      def apply[B](a: A)(implicit S: Shapely[A, B]): B = S.to(a)
    }

    final case class FieldsOf[A]() {
      def apply[B](implicit S: Shapely[A, B], F: FieldNames[B]): List[String] = F.fields
    }
  }
}

object Example extends App {
  final case class Ex(abc: String)

  println(Shapely.generic(Ex("123")))
  println(Shapely.fieldsOf[Ex].apply)
}