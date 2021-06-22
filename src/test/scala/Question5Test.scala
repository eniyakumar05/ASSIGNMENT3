import org.scalatest.flatspec.AnyFlatSpec

class Question5Test extends AnyFlatSpec {

  it should "match" in {
    assert("joy" == Question5.conditional[String]("joy", _.size > 4, _.reverse))


  }
}
