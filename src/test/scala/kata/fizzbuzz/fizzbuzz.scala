package kata.fizzbuzz

import org.specs2.mutable._
import org.specs2.ScalaCheck
import org.scalacheck.Prop
import org.junit.runner.RunWith
import org.specs2.runner.JUnitRunner
import org.scalacheck.Gen
import org.specs2.matcher.Parameters
@RunWith(classOf[JUnitRunner])
class FizzbuzzSpec extends Specification with ScalaCheck {

  val solution = new Fizzbuzz with Exercise {}
  val smallInteger = Gen.choose(0,500)
  
  implicit val params = Parameters(minTestsOk = 20, maxDiscardRatio = 200)

  "Fizzbuzz" should {
    "return correct values for multiples of 3" in {
      Prop.forAll(smallInteger) { (n: Int) =>
        ((n >= 0) && (n % 3 == 0) && (n % 5 != 0)) ==>
          (solution.fizzbuzz(n) must be equalTo ("fizz"))
      }
    }

    "return correct values for multiples of 5" in {
      Prop.forAll(smallInteger) { (n: Int) =>
        ((n >= 0) && (n % 3 != 0) && (n % 5 == 0)) ==>
          (solution.fizzbuzz(n) must be equalTo ("buzz"))
      }
    }
    "return correct values for multiples of 3 and 5" in {
      Prop.forAll(smallInteger) { (n: Int) =>
        ((n >= 0) && (n % 3 == 0) && (n % 5 == 0)) ==>
          (solution.fizzbuzz(n) must be equalTo ("fizzbuzz"))
      }
    }
    "return correct values for other values" in {
      Prop.forAll(smallInteger) { (n: Int) =>
        ((n >= 0) && (n % 3 != 0) && (n % 5 != 0)) ==>
          (solution.fizzbuzz(n) must be equalTo (n.toString()))
      }
    }
  }

}