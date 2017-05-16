def matchNum(x: Int): String = x match {
  case 0 => "zero"
  case _ => "non-zero"
}

 matchNum(-1)


//----------------------------------------------


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



/*
def eval(e: Expr): Int = e match {
    ...
}

*/
// eval(Sum(Number(5), Number(6)))


