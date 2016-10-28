// args.foreach(arg => println(arg))

val greetings = new Array[String](3)
greetings(0) = "hello"
greetings(1) = "\n"
greetings(2) = "world!"

for (word <- greetings)
  print(word)

for (i <- 0 to 2)
  print(greetings(i))