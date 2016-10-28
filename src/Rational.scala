class Rational(n: Int, d: InT) {
  // precondition
  require(0 != d)

  // initialize 未初始化的变量需要使用类参数来调用
  // 初始化后的变量需要通过实例变量来进行访问
  private val g = gcd(n.abs, d.abs)

  val numer = n / g
  val denom = d / g

  def + (that: Rational): Rational = 
    new Rational(numer * that.denom + that.numer * denom, denom * that.denom)


  def * (that: Rational): Rational = 
    new Rational(numer * that.numer, denom * that.denom)


  override def toString = numer + "/" + denom


  private def gcd(a: Int, b:Int): Int = 
    if (0 == b) a else gcd(b, a % b)



}