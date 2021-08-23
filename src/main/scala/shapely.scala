// implicit materialisation of a CaseClassN or SealedTraitN representation of a
// case class or sealed trait, respectively, which are generated.

package shapely {
  trait Shapely[A, B] {
    def to(a: A): B
    def from(b: B): A
  }

  object Shapely extends ShapelyCompat {
    def generic[A] = Derived[A]()

    final case class Derived[A]() {
      def apply[B](a: A)(implicit S: Shapely[A, B]): B = S.to(a)
    }
  }
}
