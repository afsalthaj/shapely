package shapely

object ValueOfTestExamples {
  case class Foo(s: String)

  case object CaseObject
}
import ValueOfTestExamples._

class ValueOfTest extends junit.framework.TestCase {

  def assertEquals[A](expected: A, got: A): Unit =
    assert(expected == got, s"$got != $expected")

  def testCaseClass = {
    assertEquals("s", thing(Foo("hello")))
  }

  // def testCaseObject = {
  //   assertEquals(CaseObject, implicitly[ValueOf[CaseObject.type]].value)
  // }

  def thing[A, B, A1, L1 <: String](a: A)(implicit S: Shapely[A, B], ev: CaseClass1[A, A1, L1] =:= B, v: ValueOf[L1]): String = v.value

}
