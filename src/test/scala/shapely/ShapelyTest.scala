package shapely

sealed trait Gaz
case class Foo(s: String) extends Gaz
case class Bar(txt: String, num: Long) extends Gaz
case class Baz() extends Gaz
case object Car extends Gaz

sealed trait Poly[+A]
case class PolyFoo(s: String, i: Int) extends Poly[Int]
case class PolyBar() extends Poly[Unit]

class ShapelyTest extends junit.framework.TestCase {

  def assertEquals[A](expected: A, got: A): Unit =
    assert(expected == got, s"$got != $expected")

  def assertRoundtrip[A, B](a: A)(implicit S: Shapely[A, B]): Unit =
    assertEquals(a, S.from(S.to(a)))

  def testCaseClass = {
    assertRoundtrip(Foo("hello"))
    assertRoundtrip(Bar("goodbye", -1))
  }

  def testCaseClass0 = {
    assertRoundtrip(Baz())
    assertRoundtrip(Car)
  }

  def testSealedTrait = {
    assertRoundtrip(Foo("hello"): Gaz)
  }

  def testPolyCaseClass = {
    assertRoundtrip(PolyFoo("hello", 1))
  }

  def testPolySealedTrait = {
    assertRoundtrip(PolyFoo("hello", 1): Poly[Any])
  }

}
