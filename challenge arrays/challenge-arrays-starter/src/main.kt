/**
 *
 */
fun main(args: Array<String>) {
/*
 ### ARRAYS
 Use index(of:) to determine the position of the element "Dan" in players.
*/
    var players = arrayOf("Alice", "Bob", "Dan", "Eli", "Frank")

    // Your solution here
    var dan = players[2]
    var danIndex= players.indexOf("Dan")
    println("$dan Index of Dan $danIndex")

/*
  Write a for-in loop that prints the players' names and scores.
*/

    players = arrayOf("Anna", "Brian", "Craig", "Dan", "Donna", "Eli", "Franklin")
    val scores = arrayOf(2, 2, 8, 6, 1, 2, 1)
    // Your solution here
    var index = 0
    for( player in players) {
        println("${index +1}. $player score ${scores[index]}")
        index++
    }

}