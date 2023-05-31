object ForComprehension extends App {
  val xs = List(1, 2, 3)
  for (x <- xs) println(x)

  for (n <- 0 to 9) println(n)

  for {
    i <- 2 to 9
    j <- 1 to 9
  } println(s"$i x $j = ${i * j}")

  val ys = for (x <- xs) yield x * 2 // => List(2, 4, 6)
  println(ys)

  val xs2 = List(3, 4, 5)
  val ys2 = List(1, 2)

  println(for {
    x <- xs2
    y <- ys2
  } yield x * y)
  // => List(3, 6, 4, 8, 5, 10)

}
