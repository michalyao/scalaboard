import java.util.UUID

import scala.io.Source

val jsonBody = """{"q":["avg:jvm.non_heap_memory_max{host:node1}"],"from":1477451474790,"to":1477537874790,"interval":600,"types":["line"]}"""

val from = """(?<="from":)(\d+)""".r

val to = """(?<="to":)(\d+)""".r


val changeFrom = from.replaceAllIn(jsonBody, m => (m.group(0).toLong + 15).toString)
val changeTo = to.replaceAllIn(changeFrom, m => (m.group(0).toLong + 15).toString)
println(changeTo)

val text = Source.fromFile("dir/test.txt").getLines().mkString("")
println(text)

println(UUID)