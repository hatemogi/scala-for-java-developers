object ScalaTrait extends App {

  trait Adder {
    def add(a: Int, b: Int) = a + b
  }

  trait Multiplier {
    def multiply(a: Int, b: Int) = a * b
  }

  class ScalaMath extends Adder, Multiplier

  val sm = new ScalaMath
  println(sm.add(1, 1))
  println(sm.multiply(2, 2))
}
