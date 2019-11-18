/**
 *
 */

fun main(args: Array<String>) {

    /**
     * Write a data class named Student with a firstName, lastName of type String
     * and a grade with a type Char
     */

    // Your solution here
    data class Student(val firstName: String, val lastName: String, val grade: Char)

    data class Student2(val firstName: String, val lastName: String, val grade: Char= 'A')

    /**
     * Create a variable named sam that is a student with the first name "Sam"
     * and a last name of Gamgee and a grade of 'A'
     */

    // Your solution here
    var sam = Student("Sam", "Gamgee", 'A')

    /**
     * Now make a copy of sam but with a grade of 'B'
     */

    // Your solution here
    var sam2 = sam.copy(grade = 'B')

    println(sam2)

    val joseph = Student2("Joseph","Dayssol")
    println(joseph)

}