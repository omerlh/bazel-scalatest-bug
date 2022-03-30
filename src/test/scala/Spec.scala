import org.scalatest.EitherValues._
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers
import org.scalatest.EitherValues

class Spec extends AnyFunSuite with Matchers {
  test("It should work") {
    val either : Either[Any, Int] = Right(8)

    either.value should equal(8)
  }
}