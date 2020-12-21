package shapely

sealed trait Gaz
case class Foo(s: String) extends Gaz
case class Bar(txt: String, num: Long) extends Gaz
case class Baz() extends Gaz
case object Car extends Gaz

sealed trait Poly[A]
case class PolyFoo[A](s: String, i: A) extends Poly[A]
case class PolyBar() extends Poly[Unit]

class MacroTest extends junit.framework.TestCase {

  implicit class Ops[A](val a: A) {
    def to[B](implicit S: Shapely[A, B]): B = S.to(a)
  }

  def assertEquals[A](expected: A, got: A): Unit =
    assert(expected == got, s"$got != $expected")

  def testCaseClass = {
    assertEquals(CaseClass1("hello"), Foo("hello").to)
    assertEquals(CaseClass2("goodbye", -1), Bar("goodbye", -1).to)
  }

  // TODO unimplemented path in macro
  // def testCaseClass0 = {
  //   assertEquals(CaseClass0, Baz().to)
  //   assertEquals(CaseClass0, Car.to)
  // }

  def testSealedTrait = {
    val foo = Foo("hello")
    assertEquals(SealedTrait4._1(foo), (foo: Gaz).to)
  }

  def testPolyCaseClass = {
    assertEquals(CaseClass2("hello", 1), PolyFoo("hello", 1).to)
  }

  // TODO polymorphic sealed traits
  // def testPolySealedTrait = {
  //   val cc = PolyFoo("hello", 1)
  //   assertEquals(SealedTrait2._1(cc), (cc: Poly[Int]).to)
  // }

}
