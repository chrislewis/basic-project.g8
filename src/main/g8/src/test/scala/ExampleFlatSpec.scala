package $organization$.$name;format="lower,word"$

import org.scalatest.flatspec.AnyFlatSpec

class ExampleFlatSpec extends AnyFlatSpec {

  "An empty Set" should "have size 0" in {
    assert(Set.empty.isEmpty)
  }

  it should "produce NoSuchElementException when head is invoked" in {
    assertThrows[NoSuchElementException] {
      Set.empty.head
    }
  }
}
