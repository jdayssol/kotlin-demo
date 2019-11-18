/**
 *
 */
fun main(args: Array<String>) {
    /**
     * Sum all the integers in the list that are
     * greater than 5 and print out the result
     */
    // Your Solution Here
    var myList = listOf<Int>( 2,3,4,9,15)
    println(myList.filter { it > 5 }.sum())


    /**
     * Given the Person class below, destructuring
     * the name and age
     */
    data class Person(val name: String, val age: Int)
    val sam = Person("Sam", 30)

    val (name, age) = sam
    println("$name is $age years old")
    /**
     * Print out the index and value of the map below
      */
    val names = mapOf<String, Int>("John" to 34, "Fred" to 24, "Sam" to 30, "Suzzy" to 29)

    // Your Solution Here
    names.forEach { name, age ->print("$name is $age years old ")}

}