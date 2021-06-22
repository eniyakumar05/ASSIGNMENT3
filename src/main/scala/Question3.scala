object Question3 {
  def main(args: Array[String]): Unit = {
    def Product(x: Int) = (y: Int) => x * y
    println(Product(6)(3))
  }
}