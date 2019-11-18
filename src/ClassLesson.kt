// Properties are public by default, you should have the keyword private to make them private
// This syntax declare a primary construction using his two properties, you cannont create a person without initialize the first and last name
/*
class Person(
    var firstName : String
    ) {
    var lastName : String? = "Gamgee"
    // Secondary constructor
    constructor(firstName: String,lastName: String): this(firstName) {
        this.lastName = lastName
    }
}

fun main(args: Array<String>) {
    val person = Person("Sam", "Gamgee") //  Call of the secondary constructor
    val person2 = Person("Dayssol") //  Call of the primary constructor
}
*/

// This is a primary constructor, using default value.
/*
class Person(
    var firstName : String,
    var lastName : String = "Gamgee") {
}
fun main(args: Array<String>) {
    val person = Person("Joseph") // Because there is a default value you can use a construction with only the firstName
    val person2 = Person("Sam", "Gamgee") // Or you can create it with the two properties as well.
    println("Person1 = ${person.firstName} ${person.lastName}")
    println("Person2 = ${person2.firstName} ${person2.lastName}")
}
*/

// Initializer: Block of code that is call when the object is created. It will be useful to initializa your variables, so the object is ready to be use.
// In a primary constructor you cannot write any code.
// Initializer use the keyword init.
fun main(args: Array<String>) {
    class Person(var firstName: String, var lastName: String){
        var fullName: String
        init {
            println("Init 1")
            fullName = firstName + " " + lastName
        }
        init {
            println("Init 2")
        }
    }

    val person = Person("Sam", "Gamgee")
    println(person.fullName)
}