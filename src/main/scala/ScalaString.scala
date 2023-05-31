object ScalaString extends App {
  println("Hello, World!".replace("World", "Korea"))

  val multiline =
    """안녕하세요,
    |여러 줄에 걸친
    |문자열입니다.
    """.stripMargin

  println(multiline)

  val name = "홍길동"
  val str = s"안녕하세요, ${name}님!" // => "안녕하세요, 홍길동님!"
  val sum = s"1 + 2 = ${1 + 2}"

  println(str)
  println(sum)

  val jsonString =
    """{
      |  "message": "안녕하세요",
      |  "status": 200
      |}""".stripMargin

  println(jsonString)

}
