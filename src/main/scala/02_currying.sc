def id(x: Int): Int = x
def cube(x: Int): Int = x*x*x

def sum(f: Int => Int): (Int, Int) => Int = {
  def sumInner(a: Int, b: Int): Int = {
    if (a > b) 0
    else f(a) + sum(f)(a + 1, b)
  }
  sumInner
}
