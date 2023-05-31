object PatternMatching extends App {
  def daysToString(day: Int): String = day match {
    case 1 => "하루"
    case 2 => "이틀"
    case 3 => "사흘"
    case 4 => "나흘"
    case _ => day + "일"
  }

  println(daysToString(2)) // => "이틀"
  println(daysToString(5)) // => "5일"

  trait Animal
  case class Cat(name: String, kind: String) extends Animal
  case class Dog(name: String, age: Int) extends Animal
  case class Person(name: String, adult: Boolean) extends Animal

  def show(animal: Animal): String =
    animal match {
      case Cat(name, kind)     => s"고양이 ${name}은 ${kind}종입니다."
      case Dog(name, age)      => s"강아지 ${name}는 ${age}살입니다."
      case Person(name, true)  => s"${name}님은 성인입니다."
      case Person(name, false) => s"${name}님은 미성년자입니다."
    }

  println(show(Dog("금비", 3))) // => "강아지 금비는 3살입니다."
  println(show(Person("홍길동", true)))
}
