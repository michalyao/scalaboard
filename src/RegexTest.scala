import java.util.UUID

import scala.io.Source

val windowsData = Source.fromFile("test.txt").getLines().mkString("")

val uuidGen = UUID.randomUUID().toString.substring(0, 32);


val uuid = "bba55022942750709a49fda9e073cf58"

def replaceUuid = windowsData.replaceAll(uuid, uuidGen)

println(replaceUuid)
