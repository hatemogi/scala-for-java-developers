object MethodParameter extends App {
  def update(key: String, value: Int) =
    println(s"$key -> $value")

  update("x", 3)
  update(key = "x", value = 3)
  update(value = 3, key = "x") // 좋은 방법은 아니지만, 순서는 상관 없이 쓸 수 있습니다.

  def greeting(name: String, role: String = "개발자") =
    println(s"안녕하세요, ${role} ${name}님.")

  greeting("길동") // => 안녕하세요, 개발자 길동님.
  greeting("둘리", "기획자") // => 안녕하세요, 기획자 둘리님.

  def echoInt(n: Int): Int =
    println(s"n = $n")
    n

  def ifByValue(cond: Boolean, onTrue: Int, onFalse: Int): Int =
    if cond then onTrue
    else onFalse

  ifByValue(true, echoInt(1), echoInt(2)) // => 1반환, "n = 1", "n = 2" 둘 다 프린트
  ifByValue(false, echoInt(1), echoInt(2))

  def ifByName(cond: Boolean, onTrue: => Int, onFalse: => Int): Int =
    if cond then onTrue
    else onFalse

  ifByName(true, echoInt(1), echoInt(2)) // => 1반환, "n = 1"만 프린트
  ifByName(false, echoInt(1), echoInt(2)) // => 2반환, "n = 2"만 프린트

}
