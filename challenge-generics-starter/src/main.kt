/**
 *
 */
fun main(args: Array<String>) {

    /**
     * Create a function named printItem that prints out a generic parameter.
     * Call the parameter "item"
     */

    // Your Solution Here
    fun <T>printItem(item: T) {
        println("My item is $item")
    }

    printItem("Test")
    printItem(1)


    /**
     * Create a function named printList that takes a generic list as a parameter
     * and prints out each item
     */

    // Your Solution Here
    fun <T> printList(list: List<T>) {
        println()
        for(item in list){
            print("$item ")
        }

    }

    printList(listOf("Sam","Tom","Jerry"))
    printList(listOf(1,2,3))

}
