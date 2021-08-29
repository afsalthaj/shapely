
package shapely

trait InvariantApplicativeFunctor[F[_]] {
  def pure[A](a: A): F[A]
  def product1[A, B](f: A => B)(g: B => A)(fa: F[A]): F[B]
  def product2[A, B, C](f: (A, B) => C)(g: C => (A, B))(fa: F[A], fb: F[B]): F[C]
 }
