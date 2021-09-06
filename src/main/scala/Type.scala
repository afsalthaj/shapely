package shapely

import shapely.Lazy.instance

/**
 * A typeclass that defines the relationship between
 * base typeclass instance, F[A], a possible default value of A
 * and a possible product of Annotation
 */
trait TypeClassInspect[F[_], Annotation] {
  def input: [A] => (annotations: Option[Annotation], label: String, default: Option[A], fa: F[A]) => F[A]
}

object TypeClass extends App {

  import scala.annotation.StaticAnnotation

  final case class describe(describe: String) extends StaticAnnotation

  // Test
  implicit val typeClassInspect: TypeClassInspect[shapely.example.Equal, describe] = new TypeClassInspect[shapely.example.Equal, describe] {
    override def input = [A] => (annotation: Option[describe], label: String, default: Option[A], fa: shapely.example.Equal[A]) => {
        if (default.isEmpty) fa else new example.Equal[A] {
          override def eq(a: A, b: A): Boolean = fa.eq(a, b)
        }
    }
  }

  implicit def deriveF1[F[_], Annotation, A, A1,L1 <: String](implicit f: InvariantAp[F], ev1: F[A1], ev2: TypeClassInspect[F, Annotation]): Lazy[F, CaseClass1[A, A1, L1]] = {
    val ev11 = ev2.input(None, "something", Some(null.asInstanceOf[A1]), ev1)
    instance(f.product1[A1, CaseClass1[A, A1, L1]]((a1) => CaseClass1(a1))(a => (a._1))(ev11))
  }

  final case class TestInput(a: String)


  println("result is " + example.Equal[TestInput].eq(TestInput("afsal"), TestInput("thaj")))


}