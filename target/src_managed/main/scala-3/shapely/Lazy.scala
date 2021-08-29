
package shapely

trait Lazy[F[_], A]{
   def instance: F[A]
 }

object Lazy {
  def instance[F[_], A](fa: => F[A]) = new Lazy[F, A] {
    def instance = fa
  }
 // Derive any typeclass for CaseClass1
  implicit def deriveF1[F[_], A, A1, L1 <: String](implicit f: InvariantApplicativeFunctor[F], ev: F[A1]): Lazy[F, CaseClass1[A, A1, L1]] =
    instance(f.product1[A1, CaseClass1[A, A1, L1]](CaseClass1(_))(_._1)(ev))
 }
