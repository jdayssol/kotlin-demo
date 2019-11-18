/**
 *
 */

fun main(args: Array<String>) {

/*
 ### Maps

 Create a Map with the following keys: name, profession, country, state, and city.
 For the values, put your own name, profession, country, state, and city.
 */

    // Your solution here
    var data = mutableMapOf<String,String>( "Name" to "Joseph", "Profession" to "Engineer", "Country" to "Germany", "State" to "Hamburg", "City" to "Hamburg")

    println(data)
/*
 You suddenly decide to move to Albuquerque.
 Update your city to Albuquerque, your state to New Mexico,
 and your country to USA.
 */

    // Your solution here
    data["City"]  = "Albuquerque"
    data.set("State", "New Mexico")
    data.set("Country", "USA")

    println(data)

/*
Given a Map in the above format, write a function that
prints a given player's city and state.
*/

    // Your solution here
    fun printMap(person: Map<String, String> ) {
        val state = if(person.containsKey("State")) person["State"] else ""
        val city = if(person.containsKey("City")) person["City"] else ""
        println("Person lives in " + city  + "," + state)
    }

    printMap(data)

}
