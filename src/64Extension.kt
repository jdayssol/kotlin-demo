import utils.lastChar

// Kotlin give us the ability to extend classes from library

class MovieList2(val genre: String) {

    public val movies = ArrayList<String>()

    fun addMovie(movie : String) {
        movies.add(movie)
    }

    fun print() {
        println("Movie List: $genre ")
        for (movie in movies) {
            print(movie + " ")
        }
        println("")
    }
}

// We are adding a properties to the movieList classes.
// They are static, initializers are not allowed. That means that you can update / change properties of the class but you cannot define your own
val MovieList2.movieSize : Int
get() = movies.size

fun main(args : Array<String>){

    // Extension function
    println("The last character of 'My Text' is ${"My text".lastChar()}")

    var movieList = MovieList2("action")
    movieList.addMovie("Léon")
   println(" movie list size: " +movieList.movieSize)
    // Extension properties
}