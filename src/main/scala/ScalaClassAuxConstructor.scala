object ScalaClassAuxConstructor extends App {
  class Person(var name: String, var age: Int) {
    // 인수 없는 보조 생성자
    def this() = this("", 0)

    // 인수 하나 받는 보조 생성자
    def this(name: String) = this(name, 0)

    override def toString = s"${name}님은 ${age}세입니다."
  }

  println(new Person("홍길동"))
}
