def waiting(): Int = {
  println("start to wait")
  Thread.sleep(5000)
  println("ok, that's it")
  2
}

def constOne(a: Int, b: => Int): Int = {
  println("Here I am!")
  1
}


constOne(1, waiting())

constOne(waiting(), 1)