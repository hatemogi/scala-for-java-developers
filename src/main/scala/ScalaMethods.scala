object ScalaMethods extends App {
  def add(a: Int, b: Int): Int = a + b

  println(add(2, 3))

  def triangle(a: Double, b: Double): Double = {
    val a2 = a * a
    val b2 = b * b
    Math.sqrt(a2 + b2)
  }

  println(triangle(3.0, 4.0))

  object StringUtils {
    def isNullOrEmpty(s: String): Boolean = s == null || s.trim.isEmpty
  }

  println(StringUtils.isNullOrEmpty(" "))

  def normalAdder(x: Int, y: Int) = x + y

  def multiAdder(x: Int)(y: Int): Int = x + y

  println(normalAdder(2, 3)) // => 5
  println(multiAdder(2)(3)) // => 5

  val xs = List(1, 2, 3)

  println(xs.map(x => normalAdder(2, x))) // => List(3, 4, 5)
  println(xs.map(normalAdder(2, _))) // => List(3, 4, 5)
  println(xs.map(multiAdder(2)(_))) // => List(3, 4, 5)
  println(xs.map(multiAdder(2))) // => List(3, 4, 5)

}
