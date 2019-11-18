/**
 * Given the Student data class below, create a StudentRegistry
 * singleton that has a list of students and can add and remove a
 * student from that list.
 *
 */
data class Student(val firstName: String, val lastName: String)

// Add the StudentRegistry class here

// Your Solution Here
object StudentRegistry {
    var students = mutableListOf<Student>()
    fun addStudent(student: Student) {
        students.add(student)
    }
    fun removeStudent(student: Student) {
        students.remove(student)
    }
}

/**
 * Add 2 students to the registry and then print out the list
 */
fun main(args: Array<String>) {
    // Your Solution Here
    val student1 = Student("Joseph", "Dayssol")
    val student2 = Student("Amélie", "Dayssol")

    StudentRegistry.addStudent(student1)
    StudentRegistry.addStudent(student2)

    println(StudentRegistry.students)

    StudentRegistry.removeStudent(student1)

    StudentRegistry.students.forEach {
        println(it.firstName + " " + it.lastName)
    }
}