import scala.io.Source.fromFile

object Main extends App {
  val CRASH_INFO_PATH = "src/main/resources/2022Apr_Crash.txt"
  val bufferedSource = fromFile(CRASH_INFO_PATH)
  var data = for {
    line <- bufferedSource.getLines().drop(1).toList
    values = line.split(",").map(_.trim).map(_.replace("\"", ""))
    data = CrashInfo(
      values(0),
      values(1),
      values(2),
      values(3),
      values(4),
      values(5),
      values(6),
      values(7),
      values(8),
      values(9),
      values(10),
      values(11),
      values(12),
      values(13),
      values(14),
      values(15),
      values(16),
      values(17),
      values(18),
      values(19),
      values(20),
      values(21))
  } yield data

  data.groupBy(x => x.dotNumber).foreach(x => println(x))
}
