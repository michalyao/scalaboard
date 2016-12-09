def even(from: Int, to: Int): List[Int] = 
  for (i <- List.range(from, to) if i % 2 == 0) yield i 

println(even(0, 20))

def foo(n: Int, v: Int) = 
  for (i <- 0 until n; j <- i until n if i + j == v) yield (i, j);

// omit the yield key word, to evaluate only for side effect
foo(20, 32) foreach {
  case(i, j) => println(s"""($i, $j)""")
}
