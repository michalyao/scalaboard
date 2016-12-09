def matchTest(x: Int): String = x match {
  case 1 => "one"
  case 2 => "two"
  case _ => "too many"
}
// pattern matching in scala. apply a function to an object
println(matchTest(2))
println(matchTest(6))