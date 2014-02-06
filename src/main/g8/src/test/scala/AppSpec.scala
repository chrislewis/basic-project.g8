package $organization$.$name;format="lower,word"$

import org.scalatest.{Matchers, PropSpec}
import org.scalatest.prop._

class CheckSpec
  extends PropSpec
  with GeneratorDrivenPropertyChecks
  with Matchers {

  property ("Adition and multiplication are related") {
    forAll { (x: Int) =>
      whenever(x > 0) {
        x * 2 should be(x + x)
      }
    }
  }

}
