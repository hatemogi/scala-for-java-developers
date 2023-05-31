object ScalaCollections extends App {
  val strings = Array("a", "b", "c")

  val set = Set("a", "b", "c")
  println(set)

  val map = Map(
    "a" -> 1,
    "b" -> 2,
    "c" -> 3
  )

  println(map)

  val a = Array("a", "b")
  a.foreach(println)

  val squared = List(1, 2, 3).map(x => x * x)
  println(squared)

}
