class PersonThis {
    var firstName = ""
    var child = Child()

    // This is use to specifie the object where is the properties you want to access.
    // It is use to distinguish the properties from the parameter
    fun setFirst(firstName: String) {
        this.firstName = firstName
    }

    // On a inner class you can use this@child or this@Personthis to precise the class you want to access.
    inner class Child {
        var firstName = ""


        fun printParentage() {
            println("Child ${this@Child.firstName} with parent ${this@PersonThis.firstName}")
        }
    }
}

// Extension function use this to refer to the class that we are extending
fun String.lastChar() : Char = this.get(this.length-1)

fun main(args : Array<String>){
    val person = PersonThis()
    person.firstName = "Sam"
    person.child.firstName = "Susie"
    person.child.printParentage()

    println("Hello there ${"Sammy".lastChar()}")
}

