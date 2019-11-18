/*
You can use lateInit keyword to declare that this properties will be initialized later.
At the creation of the class, it will call the init method.
You can test if a properties is initialized using .isInitialized
This way you avoid error and question mark ? on your code.
 */
class PersonLateInit(var firstName: String, var lastName: String) {
    lateinit var fullName: String

    init {
        println("init")
        fullName = firstName + " " + lastName
    }

    fun printFullName() {
        if(!this::fullName.isInitialized) {
            println("fullNameis not Initialized  yet ")
            fullName = firstName + " "+ lastName
        }
        println(fullName)
    }
}

fun main(args : Array<String>){
    var joseph = PersonLateInit("Joseph", "Dayssol")
    joseph.printFullName()
}