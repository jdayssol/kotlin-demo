// Getters and Setters
// Lateinit
// Delegated properties
// Extension properties

// Visibility for properties: By default it is public
// private / protected / internal / public

open class Person (
    var firstName : String? = null,
    var lastName: String? = null)
{
    // Protected: accessible by class and subclass
    protected var protectedProperties : String? = null
    // Accessible in the same package
    internal var internalProperties : String? = "internal"
    val fullName: String
        get()
        {
            return firstName + " " + fullName
        }
    // This will make the field private, no one can change the value except the class himself or subclass,
    // but everybody can access it, since the properties get stay public
    var otherName : String = ""
        private set
    val salutation = "Mr."
}

class Student67 : Person() {
    fun printStudentData() {
        println("$protectedProperties")
        println("$internalProperties")

    }
}

// Example of setter: field is the item of the list that is beeing updated, and value is the future value
var itemList : ArrayList<String> = ArrayList<String>()
set(value){
    field = value
    //Do something else
}
fun main (args : Array<String>) {
    val person = Person("Sam", "Smith")
    // Seems that we access the properties directly, but in reality kotlin create the getter/setter for you and call it when you reffer to the properties

    println("Person : ${person.firstName} ${person.lastName}")
    println("Person : ${person.internalProperties}")
    // person.otherName = "Jo" Cannot assign to a private properties
}