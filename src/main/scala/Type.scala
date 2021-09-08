package shapely

import shapely.Lazy.instance

import scala.annotation.StaticAnnotation

final case class ignore() extends StaticAnnotation

/**
 * A typeclass that defines the relationship between
 * base typeclass instance, F[A], a possible default value of A
 * and a possible product of Annotation
 */
trait TypeClassInspect[F[_], Annotation] {
  def input: [A] => (annotations: Option[Annotation], label: String, default: Option[A], fa: F[A]) => F[A]
}

object TypeClass extends App {
  // Test
  inline implicit def typeClassInspect[A]: TypeClassInspect[shapely.example.Equal, ignore] = new TypeClassInspect[shapely.example.Equal, ignore] {
    override def input = [A] => (annotation: Option[ignore], label: String, default: Option[A], fa: shapely.example.Equal[A]) => {
        if (annotation.isEmpty) {
          fa
        } else new example.Equal[A] {
          override def eq(a: A, b: A): Boolean = {
            true
          }
        }
    }
  }

  inline implicit def deriveF1[F[_], A, A1, L1 <: String, Annotation](implicit f: InvariantAp[F], ev1: F[A1], ev2: TypeClassInspect[F, Annotation]): Lazy[F, CaseClass1[A, A1, L1]] = {
    val annotations = Annotation.annotationOf[A1, Annotation].headOption
    val ev11 = ev2.input(None, "afsal", None, ev1)

    instance(f.product1[A1, CaseClass1[A, A1, L1]]((a1) => CaseClass1(a1))(a => (a._1))(ev11))
  }

  final case class TestInput(@ignore a: String)


  println("result is " + example.Equal[TestInput].eq(TestInput("afsal"), TestInput("thaj")))


}
