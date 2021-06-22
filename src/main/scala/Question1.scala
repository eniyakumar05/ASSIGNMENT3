object Question1 extends App {
  val max = (x: Int, y: Int) =>
    if (x > y) x else y
  def pickOne(t: (Int, Int, Int),cmp: (Int, Int) => Int): Int = {
    cmp(t._1, cmp(t._2, t._3))
  }
  println(max(23,43))
  println(pickOne((23,43,123),max))

}

