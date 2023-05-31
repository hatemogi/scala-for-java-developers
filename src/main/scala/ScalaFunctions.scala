object ScalaFunctions extends App {
  List(1, 2, 3).map(x => x + 1).foreach(println)

  val add1 = (x: Int) => x + 1
  val square = (x: Int) => x * x
  List(1, 2, 3).map(add1) // =>  List(2, 3, 4)

  val add1Square = square.compose(add1)
  println(List(1, 2, 3).map(add1Square))

  val doubler = (i: Int) => i * 2
  println(List(1, 2, 3).map(doubler))
  println(List(1, 2, 3).map(_ * 2))

  def greeting(name: String = "길동", role: String) = {
    println(s"안녕하세요, ${role} ${name}님.")
  }

  greeting(role = "개발자")
}
