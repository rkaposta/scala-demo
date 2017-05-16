trait Expr {
  def leftOp: Expr
  def rightOp: Expr
  def numValue: Int
}

class Number(n: Int) extends Expr {
  def numValue: Int = n
  def leftOp: Expr = throw new Error("number.leftOp")
  def rightOp: Expr = throw new Error("number.rightOp")
}

class Sum(e1: Expr, e2: Expr) extends Expr {
  def numValue: Int = throw new Error("sum.numValue")
  def leftOp: Expr = e1
  def rightOp: Expr = e2
}

def eval(e: Expr): Int = {
  if (e.isInstanceOf[Number]) {
    e.asInstanceOf[Number].numValue
  } else if (e.isInstanceOf[Sum]) {
    eval(e.asInstanceOf[Sum].leftOp) +
      eval(e.asInstanceOf[Sum].rightOp)
  } else {
    throw new Error("Unknown expression " + e)
  }
}


// eval(new Sum(new Number(5), new Number(6)))

/*

trait A {
  def a: String = "A"
}

trait B {
  def b: String = "B"
}

class C extends A with B

new C().a
new C().b

*/
