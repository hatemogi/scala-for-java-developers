object SingleObject extends App {
  object StringUtils {
    def isNullOrEmpty(s: String): Boolean =
      s == null || s.trim.isEmpty
  }

  class Car(val cc: Int) {
    import Car._
    def taxPerYear: Int = taxPerCc(cc).intValue * cc
  }

  object Car {
    // 배기량에 따른 cc당 자동차세 + 교육세 30%
    private def taxPerCc(cc: Int) =
      (if cc <= 1000 then 80
       else if cc <= 1600 then 140
       else 200) * 1.3

  }

  val car = new Car(2000)
  println(car.taxPerYear) // => 520000
}
