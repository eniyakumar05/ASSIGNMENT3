import org.scalatest.flatspec.AnyFlatSpec

class Question1Test extends AnyFlatSpec {

  it should "match" in {
    assert(43 == Question1.max(23, 43))
    assert(123 == Question1.pickOne((23,43,123),max))

  }
}