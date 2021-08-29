package shapely {
  object example extends App {
    trait Equal[A] {
      def eq(a: A, b: A): Boolean
    }

    object Equal {
      def instance[A](bool: Boolean): Equal[A] = (_: A, _: A) => bool

      implicit val eqString: Equal[String] = (a: String, b: String) => a == b

      implicit def eq: InvariantApplicativeFunctor[Equal] = new InvariantApplicativeFunctor[Equal] {
        override def pure[A](a: A): Equal[A]                                      = instance(true)
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

      // Derive any typeclass for Shapely
      implicit def eqOfA[A, B](implicit ev: Shapely[A, B], ev2: Lazy[Equal, B]): Equal[A] = new Equal[A] {
        override def eq(b1: A, b2: A) = ev2.instance.eq(ev.to(b1), ev.to(b2))
      }
    }

    final case class Strings(s1: String)

    println(Shapely.generic[Strings](Strings("sdsd")))
    println(Shapely.fieldNamesOf[Strings]())
    println(implicitly[Equal[Strings]].eq(Strings("afsal"), Strings("afsal")))
  }
}
