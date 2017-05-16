def matchNum(x: Int): String = x match {
  case 0 => "zero"
  case _ if x < 0 => "negative"
  case _ if x > 0 => "positive"
}

matchNum(-1)
matchNum(0)
matchNum(1)


//----------------------------------------------


trait Expr

case class Number(n: Int) extends Expr

case class Sum(e1: Expr, e2: Expr) extends Expr

def eval(e: Expr): Int = e match {
  case Number(n) => n
  case Sum(e1, e2) => eval(e1) + eval(e2)
}

eval(Sum(Number(5), Number(6)))


