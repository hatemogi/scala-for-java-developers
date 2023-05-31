import java.io.IOException

object ScalaExceptions extends App {

  def writeTextToFile(text: String) = {}

  val text = "안녕하세요"

  try {
    writeTextToFile(text)
  } catch {
    case ioe: IOException =>
      println(ioe.getMessage)
    case nfe: NumberFormatException =>
      println(nfe.getMessage)
  } finally {
    println("여기서 리소스 정리")
  }

  def makeInt(s: String): Option[Int] =
    try {
      Some(s.toInt)
    } catch {
      case e: NumberFormatException => None
    }

  makeInt("123") match {
    case Some(i) => println(s"정수 i = $i")
    case None    => println("정수로 변환할 수 없어요")
  }

  def makeIntE(s: String): Either[String, Int] =
    try {
      Right(s.toInt)
    } catch {
      case e: NumberFormatException => Left(e.getMessage)
    }

  makeIntE("123e") match {
    case Left(e)  => println(e)
    case Right(i) => println(s"정수 i = $i")
  }
}
