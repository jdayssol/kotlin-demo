// Companion object are singleront define inside a class,
// Companion A good place to defines constant, loader and constructor


class StudentWithCompanion private constructor() {
    var firstName : String? = null
    var lastName : String? = null
    companion object Loader{
        const val ID_COUNTER = "ID Counter"
        var currentStudentID = 0
        fun loadStudent(jsonText: String) : StudentWithCompanion {
            var student =  StudentWithCompanion()
            student.firstName =jsonText.substringBefore(' ')
            student.lastName = jsonText.substringAfter(' ')
            return student
        }
    }

    fun printStudent() {
        println(firstName + " " +lastName)
    }
}

fun main(args: Array<String>) {
    val student = StudentWithCompanion.loadStudent("Joseph Dayssol")
    student.printStudent()
}