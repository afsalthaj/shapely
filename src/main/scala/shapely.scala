// implicit materialisation of a CaseClassN or SealedTraitN representation of a
// case class or sealed trait, respectively.

package scala {
  trait Shapely[A, B] {
    def to(a: A): B
    def from(b: B): A
  }

  object Shapely extends ShapelyCompat {
    def apply[A, B](implicit S: Shapely[A, B]): Shapely[A, B] = S
  }
}

// the members, CaseClass[0...64] and SealedTrait[1...32], are generated
package shapely {

  trait Data[A]
  trait CaseClass[A] extends Data[A]
  trait SealedTrait[A] extends Data[A] { def value: A }

}
