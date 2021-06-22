object Question5 {
  def conditional[A](x: A, p: A => Boolean, f: A => A): A = {
    if (p(x)) f(x) else x
  }
  def main(args: Array[String]): Unit = {
    val a = conditional[String]("joy", _.size > 4, _.reverse)
    println(a)
  }

}