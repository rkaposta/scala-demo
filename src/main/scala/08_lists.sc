

def balance(chars: List[Char]): Boolean = {
  def isBalanced(chars: List[Char], counter: Int): Boolean = {
    if (chars.isEmpty) {
      counter == 0
    } else {
      if (chars.head == ')') {
        if (counter <= 0)
          false
        else
          isBalanced(chars.tail, counter - 1)
      } else if (chars.head == '(') {
        isBalanced(chars.tail, counter + 1)
      } else {
        isBalanced(chars.tail, counter)
      }
    }
  }
  isBalanced(chars, 0)
}

assert(balance("(if (zero? x) max (/ 1 x))".toList))
assert(balance("I told him (that it's not (yet) done).\n(But he wasn't listening)".toList))
assert(!balance(":-)".toList))
assert(!balance("())(".toList))