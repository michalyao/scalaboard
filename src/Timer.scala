object Timer {
  def oncePerSec(callback: () => Unit) = {
    while (true) {
      callback();
      Thread.sleep(1000l)
    }
  }

  def main(args: Array[String]): Unit = {
    oncePerSec(() => println("Hello Scala!"))
  }
}

