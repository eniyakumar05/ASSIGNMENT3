object Question4 {
  def fzero(x: String, f: String => Unit): String = {
    f(x); x
  }
  def fzero[A](x: A)(f: A ⇒ Unit): A = {
    f(x); x
  }
  def main(args: Array[String]): Unit = {
    fzero("Hello", string => println(string.reverse))
    fzero[Boolean](true) { b => println(s"b was $b") }
  }
}