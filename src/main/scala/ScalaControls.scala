object ScalaControls extends App {
  def conditionals(x: Int) =
    if (x == 1) println(x)

  conditionals(1)

  def conditionalBlock(x: Int) =
    if (x == 1) {
      println("x는 1입니다:")
      println(x)
    }

  conditionalBlock(1)

  def ifElseIf(x: Int) =
    if (x < 0)
      println("음수")
    else if (x == 0)
      println("0")
    else
      println("양수")

  ifElseIf(1) // => 양수

  def min(a: Int, b: Int): Int =
    if (a < b) a else b

  println(min(3, 5)) // => 3

  var i = 0
  while (i < 3) {
    println(i)
    i += 1
  }

  val ints = List(3, 4, 5)
  for (i <- ints) println(i)
  for (i <- ints) {
    val x = i * 2
    println(s"i = $i, x = $x")
  }

  for {
    i <- 1 to 2
    j <- 'a' to 'b'
    k <- 1 to 10 by 5
  } println(s"i = $i, j = $j, k = $k")

  val ints2 = (1 to 10).toList
  for {
    i <- ints2
    if i % 2 == 0
    if i < 5
  } println(i)

  val weekday = 2
  val weekdayAsString = weekday match {
    case 1 => "월요일"
    case 2 => "화요일"
    case _ => "기타"
  }

  println(weekdayAsString)

  i = 3
  val numAsString = i match {
    case 1 | 3 | 5 | 7 | 9  => "홀수"
    case 2 | 4 | 6 | 8 | 10 => "짝수"
    case _                  => "범위초과"
  }

  println(numAsString)
}
