// Extractor Object before pattern matching
object Twice {
  def apply(x: Int): Int = x * 2 // construtor like.
  def unapply(z: Int): Option[Int] = if (z%2 == 0) Some(z/2) else None
}
// test -> Boolean; sub-value -> Option[T]; sub-values -> Option[(T1, T2..., Tn)] tuple
val x = Twice(21)
x match { case Twice(n) => println(n) }