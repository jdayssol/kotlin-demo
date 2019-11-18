import kotlin.properties.Delegates

/**
 * Copy the Course class you created in the lateinit challenge
 * and add a courseDescription String that is created with the lazy function
 * Have the returned string contain the className and the teacherName
 */
/**
 *  add a room String variable that is an Observable, has a "No Room" initial value
 *  and prints out the new value
 */
// Your solution here
class Course (var className : String){
    val courseDescription : String by lazy {
        "Course ${className} taught by $teacherName"
    }
    private lateinit var teacherName : String
    var room = String by Delegates.observable("No room") {
        property, oldValue, newValue -> println("New value is $newValue")
    }

    fun initTeacherName(teacherName : String) {
        this.teacherName = teacherName
    }

}


/**
 * Add a main function, create a Course and set the teacher name,
 * room and print out the courseDescription
 */
fun main(args: Array<String>) {
// Your solution here
    var math = Course("Math")
    math.initTeacherName("Ms price")
    math.room = "Library"
    println("Course description ${math.courseDescription}")
    println("Course is ${math}")



}