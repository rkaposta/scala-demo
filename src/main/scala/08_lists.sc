

def balance(chars: List[Char]): Boolean = {
  true
}

assert(balance("(if (zero? x) max (/ 1 x))".toList))
assert(balance("I told him (that it's not (yet) done).\n(But he wasn't listening)".toList))
assert(!balance(":-)".toList))














































assert(!balance("())(".toList))