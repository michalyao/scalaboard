object FilterTest extends App {
  def filter(xs: List[Int], threshold: Int) = {
    def process(ys: List[Int]): List[Int] = {
      if (ys.isEmpty) ys
      else if (ys.head < threshold) ys.head :: process(ys.tail)
      else process(ys.tail)
    }
    process(xs)
  }
  println(filter(List(1, 5, 7, 3, 4, 8, 9), 6))
}

