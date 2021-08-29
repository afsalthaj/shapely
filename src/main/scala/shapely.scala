import shapely.CaseClass0
import shapely.CaseClass1
import shapely.Shapely
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

object example extends App {
  trait InvariantFunctor[F[_]] {
    def imap[A, B](f: A => B)(g: B => A): F[A] => F[B]
  }

  trait InvariantApplicativeFunctor[F[_]] {
    def pure[A](a: A): F[A]
    def product1[A, B](f: A => B)(g: B => A)(fa: F[A]): F[B]
    def product2[A, B, C](f: (A, B) => C)(g: C => (A, B))(fa: F[A], fb: F[B]): F[C]
  }

  trait Equal[A] {
    def eq(a: A, b: A): Boolean
  }

  object Equal {
    def instance[A](bool:Boolean): Equal[A] = (_: A, _: A) => bool
    
    implicit val eqString: Equal[String] = (a: String, b: String) => a == b
    
  


    implicit def eq: InvariantApplicativeFunctor[Equal] = new InvariantApplicativeFunctor[Equal] {
      override def pure[A](a: A): Equal[A] = instance(true)
      override def product1[A, B](f: A => B)(g: B => A)(fa: Equal[A]): Equal[B] =
        (a: B, b: B) => {
          val a1 = g(a)
          val a2 = g(b)
          fa.eq(a1, a2)
      }

      override def product2[A, B, C](f: (A, B) => C)(g: C => (A, B))(fa: Equal[A], ga: Equal[B]): Equal[C] =
        (a: C, b: C) => {
          val (a1, b1) = g(a)
          val (a2, b2) = g(b)
          fa.eq(a1, a2) && ga.eq(b1, b2)
      }
    }
  }

    final case class Strings(s1: String)


    println(Shapely.generic[Strings](Strings("sdsd")))

    import Equal._
    trait Lazy[F[_], A]{
      def instance: F[A]
    }

    object Lazy {
      def instance[F[_], A](fa: => F[A]) = new Lazy[F, A] {
        def instance = fa
      }

    // Derive any typeclass for CaseClass1
     implicit def deriveAnyTypeClass[F[_], A, A1, L1 <: String](implicit f: InvariantApplicativeFunctor[F], ev: F[A1]): Lazy[F, CaseClass1[A, A1, L1]] = 
       instance(f.product1[A1, CaseClass1[A, A1, L1]](CaseClass1(_))(_._1)(ev))
    }

      // Derive any typeclass for Shapely
     implicit def eqOfA[A, B](implicit ev: Shapely[A, B], ev2: Lazy[Equal, B]): Equal[A] = new Equal[A] {
       override def eq(b1: A, b2: A) = ev2.instance.eq(ev.to(b1), ev.to(b2))
     }
    
    println(implicitly[Equal[Strings]].eq(Strings("afsal"), Strings("afsal")))

  }
}