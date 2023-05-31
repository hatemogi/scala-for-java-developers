@main def hello: Unit = 
  println(
    """안녕하세요,
      |띄어쓰기 위치를
      |기호를 이용해서 표시해 봅시다.
    """.stripMargin
  )
  println(new Person("홍길동", 45))

