import kotlin.properties.Delegates

// properties Lazy / Observable / Mapped
/*
    var room: String by Delegates.observable("No room") {
        property, oldValue, newValue ->
        println("New value is $newValue")
    }
 */
data class Course(val map: Map<String, Any?>){
    var room: String by map
    val teacher: String by map
}

//Lazy
// Science course will be create on his first use and will be cached
/*
var scienceCourse: Course by lazy {
    Course("Science")
}
*/

// Observable delegate notifies you when the variable changes

fun main(args : Array<String>){

    val course = Course(mapOf("room" to "Room1", "teacher" to "Ms Price"))
    println(course)
}