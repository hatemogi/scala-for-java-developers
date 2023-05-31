import scala.io.Source

object WordCount extends App {
  val words = for {
    lines <- Source
      .fromURL("https://www.gutenberg.org/cache/epub/100/pg100.txt")
      .getLines()
    words <- lines.split(" ")
  } yield words.strip
  words.toList.groupBy(identity).map
}
