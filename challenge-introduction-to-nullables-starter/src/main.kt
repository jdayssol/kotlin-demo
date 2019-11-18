/**
 *
 */
fun main(args: Array<String>) {
/*
 ### INTRODUCTION TO Nullables
 
 Make an Nullable `String` called `myFavoriteSong`. If you have a favorite song,
 set it to a string representing that song. If you have more than one favorite song
 or no favorite, set the Nullable to `null`.
 */
    // Your solution here
    var myFavoriteSong  : String? = "Champs Elysees"

/*
 Create a method named printFavoriteSong that takes a nullable song
 and print the value
 */
    // Your solution here
    fun printFavoriteSong( song : String?) {
    println("My song is $song")
}


/*
 Print your favorite song
 Print null. What happens?
 */
    // Your solution here
    printFavoriteSong(myFavoriteSong)
}
