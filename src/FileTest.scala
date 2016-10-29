import java.nio.file._

import scala.collection.JavaConversions._
import scala.util.Random

def getListOfFiles(dir: String): List[Path] =
  Files.newDirectoryStream(Paths.get(dir)).filter(_.toString.endsWith(".txt")).map(_.toAbsolutePath).toList


def getRandomInput(dir: String): Path = {
  val files = getListOfFiles(dir)
  return files(Random.nextInt(files.length))
}
println(getRandomInput("dir"))