// implicit materialisation of a CaseClassN or SealedTraitN representation of a
// case class or sealed trait, respectively.

package scala {
  trait Shapely[A, B] {
    def to(a: A): B
    def from(b: B): A
  }

  object Shapely extends ShapelyCompat {
    def apply[A, B](implicit O: Shapely[A, B]): Shapely[A, B] = O
  }
}
