// Interface: Is useful when you want multiple class to share the same behaviour.
// You can define methods in interface and the classe implementing this interface should override the interface methods.
// In kotlin you can define properties in interface, which are also part of the contract, the classes have to implement the properties

interface Animal {
    fun eat()
    val numLegs: Int
}

class Dog: Animal {
    override val numLegs: Int = 4
    override fun eat() {
        println("Dog eating loudly")
    }
}

class Cat: Animal {
    override val numLegs: Int = 4
    override fun eat() {
        println("Cat eating softly")
    }
    fun meow() {
        println("Meow, meow")
    }
}

fun main(args: Array<String>) {
    val dog = Dog()
    val cat = Cat()

    dog.eat()
    cat.eat()
    cat.meow()
}