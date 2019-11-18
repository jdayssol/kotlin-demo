

// In Kotlin all classes are final by default, you need to add open to subclass them
// Sealed make impossible to subclass, unless you are on the same file, they are virtual and cannot have a constructor, but their subclass can
sealed class Expression
data class Num(val number: Double) : Expression()
data class Sum(val e1: Expression, val e2 : Expression) : Expression()

object NotANumber : Expression()

fun eval(expr: Expression): Double = when(expr) {
    is Num -> expr.number
    is Sum -> eval(expr.e1) + eval(expr.e2)
    NotANumber -> Double.NaN
}

// Singleton : it can only exist one object of this class
// Use object keyword to create a singleton
// Singleton are useful when you need to share a single instance of a class
// They can have supertypes cannot be nested in other objects or non-inner classes

object MySingleton {
    fun doMyStuff(data: String) {
        println("This is my data $data")
    }
    val myConstant = "This is my constant"
}



fun main(args: Array<String>) {

    val num1 = Num(5.5)
    val num2 = Num(10.0)
    println("num1 + num2 is ${eval(Sum(num1,num2))}")

    MySingleton.doMyStuff(MySingleton.myConstant)

}