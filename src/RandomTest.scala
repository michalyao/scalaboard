import scala.util.Random

val seriesBody1 = """{"q":["avg:system.mem.pct_usage{host:fjc_test_bat_478}"],"from":1477568575989,"to":1477570375989,"interval":10,"types":["line"]}"""
val seriesBody2 = """{"q":["avg:system.disk.pct_usage{host:fjc_test_bat_478;device:c:}"],"from":1477568575989,"to":1477570375989,"interval":10,"types":["line"]}"""
val seriesBody3 = """{"q":["avg:system.net.ping_response_time{host:bnd-1;producer:H3C;equipment:Router}"],"from":1477568575989,"to":1477570375989,"interval":10,"types":["line"]}"""
val seriesBody4 = """{"q":["avg:system.cpu.pct_usage{host:bnd-1;equipment:Router;producer:H3C}"],"from":1477568575989,"to":1477570375989,"interval":10,"types":["line"]}"""
val seriesBody5 = """{"q":["avg:system.cpu.idle{host:bnd-1;producer:H3C;equipment:Router}"],"from":1477568575989,"to":1477570375989,"interval":10,"types":["line"]}"""
val seriesBody6 = """{"q":["avg:system.port.status{host:bnd-1;port:Bridge-Aggregation1;equipment:Router;producer:H3C}"],"from":1477568575989,"to":1477570375989,"interval":10,"types":["line"]}"""
val seriesBody7 = """{"q":["avg:system.port.in_rate{host:bnd-1;port:Bridge-Aggregation1;equipment:Router;producer:H3C}"],"from":1477568575989,"to":1477570375989,"interval":10,"types":["line"]}"""

val jsonList = List(seriesBody1, seriesBody2, seriesBody3, seriesBody4, seriesBody5, seriesBody6, seriesBody7)
def randomQuery = jsonList(Random.nextInt(jsonList.length))
def randomHost = "uyun-bat" + Random.nextInt

val tagRegex = """\{\w(.*?)\}""".r // 匹配标签
val changeTag1 = tagRegex.replaceAllIn(randomQuery, s"""{host:${randomHost}}""")
val changeTag2 = tagRegex.replaceAllIn(randomQuery, s"""{host:${randomHost}}""")
val changeTag3 = tagRegex.replaceAllIn(randomQuery, s"""{host:${randomHost}}""")
val changeTag4 = tagRegex.replaceAllIn(randomQuery, s"""{host:${randomHost}}""")

println(changeTag1)
println(changeTag2)
println(changeTag3)
println(changeTag4)


