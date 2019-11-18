/*
 ## CLASSES VS STRUCTURES

 Imagine you're writing a movie-viewing application in Kotlin.
 Users can create lists of movies and share those lists with other users.

 Create a `MovieList`  and a `MovieGoer` class

 - `MovieList` - Contains a genre String passed in the constructor
    and an array of movie titles set as a property.
    Create a `print` method that will print all the movies in the list.
 - `MovieGoer` - Add a method `addList(movieList)` which adds the given list
    to a map of `movieList` objects (using the `genre` as a key).
    Add a method `movieListFor(genre) : MovieList?`
    that will return the Nullable `MovieList` for the provided genre.
    Add a method 'addMovie'(genre, movie) that will add a movie to the given genre
 - Create `jane` and `john` users in main and have them create and share lists.
    Have both `jane` and `john` modify the same list and call `print` from both users.
    Are all the changes reflected?
*/

class MovieList(val genre : String) {
    private val movies = ArrayList<String>()

    fun addMovie(movie: String) {
        movies.add(movie)
    }
    fun print() {
       println("Genre $genre")
        for(movie in movies){
            print(movie+ " ")
        }
        println()
    }
}

class MovieGoer() {
    private var movieMap = HashMap<String,MovieList>()

    fun movieListFor(genre: String) : MovieList? {
        return movieMap.get(genre)
    }

    fun addGenre(genre: String) {
        movieMap[genre] = MovieList(genre)
    }
    fun addMovie(genre: String , movie: String){
        if(!movieMap.containsKey(genre)){
            addGenre(genre)
        }
        movieMap[genre]?.addMovie(movie)
    }

}

/*
 ### Challenge 2
Make movieList private and remove addList.
Add a method to MovieList to add a movie and make movies private
Create a new method in MovieGoer called addGenre that takes a genre and creates a new MovieList object.
Update MovieGoer.addMovie to use the MovieList's addMovie method and check to see if the MovieList
exists before trying to add
*/


// Your Solution Here

fun main(args: Array<String>) {


    // Test your classes here
    val jane = MovieGoer()
    val john = MovieGoer()

    jane.addMovie("Action", "Rambo")
    john.addMovie("Action", "Terminator")
    john.addMovie("Action", "Die Hard")

    jane.movieListFor("Action")?.print()
    john.movieListFor("Action")?.print()

/*
 ### Challenge 3jan

 Your challenge here is to build a set of objects to support a t-shirt store.

 - `TShirt` - Represents a shirt style you can buy. Each `TShirt` has a size (Int), color(Int), price (Double)
 - `Address` - Represents a shipping address, containing the
    number, street, city, and zip code.
 - `ShoppingCart` - Holds a current order, which is composed of an list of `TShirt`
    that the `User` wants to buy, as well as a method to calculate the total cost.
    Additionally, there is an `Address` that represents where the order will be shipped.

 - `User` - A registered user of the t-shirt store app.
    A user has a name, email, and a `ShoppingCart` (below).
 */

    // Your Solution Here
    class TShirt(var size: Int, var color: Int,var price : Double) {}

    class Address(var number: String,var street: String,var city : String,var zipCode: String) {
    }

    class ShoppingCart() {
        var order = ArrayList<TShirt>()
        var address = Address("","","","")
        fun calculateTotal(): Double {
            var total : Double = 0.0;
            for(tshirt in order){
                total+= tshirt.price
            }
            return total
        }

    }
    class User(var name: String, var email: String, var shoppingCart: ShoppingCart){
    }


    val grey = TShirt(1,5,15.0)
    val greyXL = TShirt(5,5,15.0)
    val red = TShirt(1,3,20.0)

    val add = Address("19","kottwitstrasse","Hamburg","20253")
    val cart = ShoppingCart()
    cart.order.add(grey)
    cart.order.add(greyXL)
    cart.order.add(red)

    cart.address = add

    val joseph = User("Joseph","joseph@gmail.com",cart)
    println("Total des achats " +joseph.shoppingCart.calculateTotal())
}
