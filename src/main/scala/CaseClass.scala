object CaseClass extends App {

  case class Point(x: Double, y: Double)

  case class Circle(point: Point, radius: Double)

  val center = Point(0.0, 0.0)
  val smallCircle = Circle(center, 1.0)
  println(smallCircle.radius) // => 1.0

  println(Circle(center, 1.0) == Circle(center, 1.0)) // => true
  println(Circle(center, 1.0) == Circle(center, 2.0)) // => false

  val aCircle = Circle(Point(0.0, 0.0), 1.0)
  val biggerCircle = aCircle.copy(radius = 2.0)
  val movedCircle = biggerCircle.copy(point = Point(2.0, 2.0))

  println(movedCircle)
}
