/**
 *
 */
fun main(args: Array<String>) {
/*
 ### Lists
 Create a list with the following states that you have lived in:
 */

    // Your solution here
    var states = mutableListOf<String>("France", "Allemagne", "USA")

    // Add a new State
    states.add("Japan")
    println(states)
/*
Given a function to print out all states but the third index
*/

    // Your solution here
    fun printStates( states: List<String>) {
        for(i in 0 .. states.size-1){
            if( i != 3){
                print("${states[i]} ")
            }
        }
    }

    printStates(states)


}
