// implicit materialisation of a CaseClassN or SealedTraitN representation of a
// case class or sealed trait, respectively, which are generated.

package scala {
  trait Shapely[A, B] {
    def to(a: A): B
    def from(b: B): A
  }

  object Shapely extends ShapelyCompat {
    def apply[A, B](implicit S: Shapely[A, B]): Shapely[A, B] = S
  }
}
