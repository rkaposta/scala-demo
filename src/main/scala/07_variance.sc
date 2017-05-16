class IntSet {}

class NonEmptyIntSet extends IntSet {}

def a: Array[NonEmptyIntSet] = Array( new NonEmptyIntSet())
//def b: Array[IntSet] = a


def c: List[NonEmptyIntSet] = List( new NonEmptyIntSet())
def d: List[IntSet] = c



//---------------------------------------


abstract class Animal {
  def name: String
}
case class Cat(name: String) extends Animal
case class Dog(name: String) extends Animal


// COVARIANCE

  def printAnimalNames(animals: List[Animal]): Unit = {
    animals.foreach { animal =>
      println(animal.name)
    }
  }

  val cats: List[Cat] = List(Cat("Whiskers"), Cat("Tom"))
  val dogs: List[Dog] = List(Dog("Fido"), Dog("Rex"))

  printAnimalNames(cats)
  printAnimalNames(dogs)

// CONTRAVARIANCE

abstract class Printer[-A] {
  def print(value: A): Unit
}

class AnimalPrinter extends Printer[Animal] {
  def print(animal: Animal): Unit =
    println("The animal's name is: " + animal.name)
}
class CatPrinter extends Printer[Cat] {
  def print(cat: Cat): Unit =
    println("The cat's name is: " + cat.name)
}

val myCat: Cat = Cat("Boots")
def printMyCat(printer: Printer[Cat]): Unit = {
  printer.print(myCat)
}

val catPrinter: Printer[Cat] = new CatPrinter
val animalPrinter: Printer[Animal] = new AnimalPrinter
printMyCat(catPrinter)
printMyCat(animalPrinter)


