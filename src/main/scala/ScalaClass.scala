object ScalaClass extends App {

  class Person(var name: String, var age: Int) {
    override def toString = s"${name}님은 ${age}세입니다."
  }

  println(new Person("홍길동", 20))
}
