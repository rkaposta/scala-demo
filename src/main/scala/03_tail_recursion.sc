import scala.annotation.tailrec

def countDown(counter: Int): Unit = {
  if (counter > 0) {
    println(counter)
    countDown(counter-1)
  }
}
countDown(5)


//def boom(n: Int): Nothing = if(n<=0) throw new Exception else boom(n-1)
//boom(10)


//@tailrec
def factorial(n: Int): Int = {
  if (n == 0) 1
  else n * factorial(n - 1)
}

// factorial(?)

