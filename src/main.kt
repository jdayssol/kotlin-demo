import com.sun.org.apache.xpath.internal.operations.Bool
import kotlin.random.Random

// TypeAlias must be defined at the top of a file
// Create a alias for function like add, substract. It can be used to define a function in a parameter list for example
typealias operation = (Int, Int) -> Int

interface Repository<T> {
    fun addItem(item:T)
    fun deleteItem(item:T)
}

class Personmain(val name : String) {}

class PersonRepository: Repository<Personmain> {
    override fun addItem(item: Personmain) {

    }

    override fun deleteItem(item: Personmain) {

    }
}



fun main(args: Array<String>) {

    // 3 Basics
    // Val is constaint, Var is variable
    val temperature = 37.5
    val count : Int = 5
    var sam = "Sam"

    sam = "Fred"

    // count = 7 Val cannot be reassigned

    // Declaration of function, using fun and : return type
    fun calculateTemperatur(celsius : Double) : Double {
        return 9/5 * celsius + 32
    }

    // How to print and how to call a function inside a string
    println("Temp = ${calculateTemperatur(20.0)}")
    println("Temp = ${calculateTemperatur(50.0)}")

    // Convert a string to a int
    val intValue = "32".toInt()
    println("intValue = $intValue")

    // Convert a int to a string
    val intString = 32.toString()
    println("intString = $intString")

    val fahrenheit = 32
    // When structure, like a switch but for array
    when( fahrenheit) {
        in 0..30 -> println("really cold")
        in 31..40 -> println("Getting colder")
        in 41..50 -> println("Kind of cold")
        in 51..60 -> println("Nippy")
        in 61..80 -> println("Just right")
    }

    var nullableName : String? = null // Declaration of a string null
    var length = nullableName?.length ?: -1 // If length of nullableName exist, it will affect it to length variable, if not, it will affect  -1
    println("length $length")
    nullableName = "Sam"
    length = nullableName?.length ?: -1
    println("length2 $length")

    // 5 Pair and Triple
    var coordonates = Pair(2,3)
    val (x,y ) = coordonates
    println("x= $x y=$y")
    println("coordonates = $coordonates.first $coordonates.second")

    var coordonateMixed = Pair(2.3,5)
    println("coordonateMixed = $coordonateMixed.first $coordonateMixed.second")

    val coordonate3D = Triple(1,2,3)
    val (x3,y3 ,z3) = coordonate3D
    println("coordonate3D = $coordonate3D.first $coordonate3D.second $coordonate3D.third")
    println("x3= $x3 y=$y3 z=$z3")

    // 7 Boolean
    val yes1 : Boolean = true
    val no1 : Boolean = false

    val yes2 : Boolean = true
    val no2 : Boolean = false

    println("yes = ${yes1 == yes2} no = ${no1 == no2}")

    val doesOneEqualTwo = (1==2)
    println("doesOneEqualTwo $doesOneEqualTwo")

    val longName = "Samantha".length > 5
    println("longName $longName");

    val and = true && true
    println("and $and");

    val or = true || false
    println("or $or");

    val guess = "dog"
    val dogEqualCat = guess == "cat"
    println("dogEqualCat $dogEqualCat");

    val a = 5
    val b = 10

    val min : Int
    if(a < 5){
        min = a
    }else{
        min = b
    }
    println(" min $min")

    // 9 Scope
    var hoursWorked = 45
    var price = 0.0
    if(hoursWorked > 40){
        // variable inside a bracked { is in a determined scope, and doesn't exist outside this scope
        val hoursOver40= hoursWorked -40
        price += hoursOver40 * 50
        hoursWorked -= hoursOver40
    }
    price += hoursWorked *25
    println("Price $price")
    // println(hoursOver40) out of the scope

    //Part 2
    // 12 While loop
    var i= 1
    while (/*condition*/ i <10) {
        //loop code
        print(i)
        i+= 1
    }

    // do while, loop code is always executed as least one time
    i= 1
    do {
        print(i)
        if( i == 5){
            // Break exit the loop
            break;
        }
        i+= 1
    }while(i <10)

    println("")
    var count2 = 0
    var roll = 0
    var random = Random(2)
    do{
        roll = random.nextInt(6)
        count2 += 1
        println("After $count2 rool(s), rool is $roll")
    }while( roll !=0)

    // 14 For Loops
    // Range Type
    val range = 0..5

    val myCount = 10
    var sum = 0
    for(i in 1..myCount){
        sum +=1
    }
    print("sum = $sum ")

    for(i in 1..myCount){
        if(i%2 ==1){
            println("$i is an odd number")
        }
    }

    println()
    // Use continue to interate to the next iteration of the loop
    // Use break to exit the loop
    for(i in 1..5){
        println("Hello $i")
        if(i==3){
            continue
        }
        if(i==4){
            break;
        }
        println("GoodBye $i")
    }
    println()
    for(row in 1..3){
        for(column in 1..3){
            print(column)
        }
        println()
    }
    // Label to name the loop, you can exit to this loop precisely
    outer@ for (row in 1..3){
        for(column in 1..3){
            if(row ==2 && column ==2){
                println()
                continue@outer
            }
            print(column)
        }
        println()
    }

    //16 When expression

    //When using condition equal == with a number
    val number = 10
    when (number) {
        0 -> println("Zero")
        10 -> println("Ten")
        else -> println("Non Zero")
    }

    //When using condition equal == with a string
    val string = "Dog"
    when( string) {
        "Cat", "Dog" -> println("Animal is house pet")
        else -> println("Animal is wild")
    }

    // When using a range
    when(number) {
        in 1..9 -> println("Between 1 and 9")
        in 10..20 -> println("Between 10 and 20")
        else -> println("Some other number")
    }

    // When with no argument
    when {
        number % 2 == 0 -> println ( " Even")
        else -> println ( " Odd")
    }

    val testValue = 10
    val result = when {
        testValue < 10 -> "Less than 10"
        testValue > 10 -> "Greater than 10"
        else -> "Is equal to 10"
    }
    println("Result = $result")

    val pair = Pair("Joseph", 37)
    val ageStatement = when(pair.second){
        in 0..2 -> ("Infant")
        in 3..12 -> ("Child")
        in 13..19 -> ("Teenager")
        in 20..39 -> ("Adult")
        in 40..60 -> ("Middle aged")
        in 61..110 -> ("Elderly")
        else -> ("Invalid Age")
    }
    print("${pair.first} is $ageStatement")

    //Part 3 Functions and nullable
    //Function without parameter
    fun printMyName() {
        println("My name is Joseph Dayssol")
    }
    printMyName()

    //Function with parameter
    // Example with two parameter
    fun printMultipleOf( multiplier: Int, addValue: Int){
        println("$multiplier * $addValue = ${multiplier *addValue} ")
    }
    printMultipleOf(4,2)

    // If second parameter is not specified, his value will be 1
    fun printMultipleOfTwo(multiplier: Int, value: Int = 1) {
        println("$multiplier * $value = ${multiplier *value} ")
    }
    printMultipleOfTwo(4)

    fun multiply(number: Int, multiplier: Int) : Int {
        return number * multiplier
    }
    println(multiply(4,2))

    fun multiplyAndDivide(number: Int, factor: Int): Pair<Int,Int> {
        return Pair(number*factor, number/factor)
    }
    println("Multiply and Divide ${multiplyAndDivide(4,2)}")

    fun calculateFullNameWithLength(firstName: String =" Default firstName", lastName: String =" Default firstName") : Pair<String,Int> {
        val fullName = firstName +" " +lastName;
        return Pair(fullName,fullName.length)
    }

    println("calculateFullNameWithLength:");
    println(calculateFullNameWithLength("Joseph","Dayssol"))

    // 22 More functions
    // Overloading : You can use the same name for different functions, but the parameter change.
    // You can't have two functions with same name & parameter but different return type: it does'nt compile
    // Parameter are copied and pass by value, and can't be modified

    fun add(a : Int, b : Int) : Int {
        return a + b
    }

    // Variable as a function : it take two Int and return a int. Then we assigned it to the add function
    var functionAdd : (Int , Int) -> Int = ::add

    println("functionAdd(4,2)")
    println(functionAdd(4,2))

    // Function can also be a parameter in another function
    fun printResult( function:( Int , Int) -> Int , a : Int , b : Int) {
        val result = function(a,b)
        println(result)
    }
    printResult(::add, 4,2)

    // Same as printResult, but usin typeAlias it is easier to read
    // Unit return mean that the function return nothing
    fun printResult2(function:operation, a : Int, b : Int) : Unit {
        val result = function(a,b)
        println(result)
    }

    // 23 Nullables
    // Nullables are variable that can or cannot be null. It is practical to use when you don t know if the variable have a value or not
    // Like a nickname : Not everybody have one:
    var nickName : String? = null

    fun printNickName( nickName : String?) {
        println("My nickname is $nickName")
    }

    println()
    printNickName(nickName)
    nickName = "Jo"
    printNickName(nickName)

    var resultN : Int? = 30
    // Not safe call, will result in a compilation error
    // Error:(327, 21) Kotlin: Operator call corresponds to a dot-qualified call 'resultN.plus(1)'
    // which is not allowed on a nullable receiver 'resultN'.
    //println(resultN + 1)

    // This is a safe call . Using ? or !! (double bang operator) will make the compilator evaluate the expression
    println(resultN?.plus(5))
    println(resultN!! + 6)


    var authorName : String? = null
    // Since authorName is null, force the evaluation will throw a exception
    //println(authorName!!)

    //authorName = "Joseph"
    authorName?.let { name ->
        println("Author name is name $name")
    }
    // Default parameter is it
    authorName.let { println("Author name is it $it")
    }


    var xN : Int? = null
    // Using this if statement , we check that the value is null or not and avoid the exception
    if ( xN != null) {
        xN += 1
    }
    println("xN = $xN")

    // Shortcut for if statement: Using elvis operator we can affect the value of nullableInt or if nullableInt is null, 0
    var nullableInt : Int? = 10
    var mustHaveResult = nullableInt ?: 0
    println("mustHaveResult $mustHaveResult")

    //Part 4 Collections
    // Arrays : store value of the same type, are ordered by a index and immutable.
    // Index start with 0, means that the last element of a array will be array[lenght - 1]
    // You can t add or delete a item, but you can find it easily using contains or his index, and you can modifiy it

    val eventNumbers = arrayOf(2,4,6,8)

    val eventNumbers2 : Array<Int> = arrayOf(2,4,6,8)
    val intNumbers = intArrayOf(2,4,6,8)

    var players = arrayOf ("Alice", "Joseph", "Charlotte", "Michel")

    // size methods tell you how many items is in the array
    if(players.size < 2){
        println("We need more players")
    }else{
        println("Let s start")
    }

    println(players.isEmpty())
    println(players.first())

    val firstPlayers = players.get(0)
    println("firstPlayers $firstPlayers")

    // To get another array that is a slice of the array you can use the slice method
    println("Slice a Array")
    val upComingPlayers = players.sliceArray(0..2)
    for(players in upComingPlayers){
        println(players)
    }

    fun isElimitated(player : String) : Boolean {
        return !players.contains(player)
    }

    println(isElimitated("Joseph"))
    println(isElimitated("Fred"))

    players[2] = "Sammy"

    for(players in players){
        println(players)
    }

    fun sumOfAllItems(array : IntArray) : Int {
        var sum = 0
        for(number in array) {
            sum += number
        }
        return sum
    }
    sum = sumOfAllItems(intArrayOf(2,3,4))
    println("Sum of all items $sum")

    // Drop method will return a new array without the firsts items, depending on how many item you drop
    val prices = arrayOf(1,30,40,100)
    val removeFirst = prices.drop(1)
    println(removeFirst)
    println(prices.drop(2))

    // DropLast method will return a new array without the last items, depending on how many item you drop
    println(prices.dropLast(1))

    players = arrayOf("Alice", "Bob", "Dan", "Eli", "Frank")

    // Your solution here
    var dan = players[2]
    var danIndex= players.indexOf("Dan")
    println("$dan Index of Dan $danIndex")

    players = arrayOf("Anna", "Brian", "Craig", "Dan", "Donna", "Eli", "Franklin")
    val scores = arrayOf(2, 2, 8, 6, 1, 2, 1)
    // Your solution here
    var index = 0
    for( player in players) {
        println("${index +1}. $player score ${scores[index]}")
        index++
    }

    // This is another way to loop on a array using a forEach
    println()
    players.forEachIndexed { index, player ->
        println("${index +1}. $player score ${scores[index]}")
    }

    // 31 List In Kotlin lists are by default unmutable, you can't add item. You can use mutatblaList to be able to add / remove item
    //
    val names = listOf("Anna", "Brian", "Craig", "Donna")
    println(names)
    // Mutable List
    val teamNames = mutableListOf<String>()
    teamNames.addAll(names)
    teamNames.add("Joseph")
    println(teamNames)

    // To access item you can use the index or the bracket
    println(teamNames[0])
    println(teamNames.indexOf("Brian"))

    teamNames.remove("Craig")
    println(teamNames)

    for(name in teamNames) {
        println("Team Member: $name")
    }

    var states = mutableListOf<String>("France", "Allemagne", "USA")
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

    //33 Maps Unordered collection of pair, which is a key and a value. Key must be unique, it can"t appear twice in a map
    // Not like array, Key can be any type and don't need to be ordered
    // Here name are keys, score are values
    var namesAndScores = mapOf( "Anna" to 2, "Brian" to 2, "Craig" to 8, "Donna" to 6)
    println(namesAndScores)

    println(namesAndScores["Anna"])
    // println(namesAndScores["Greg"]) Will return null

    println(namesAndScores.isEmpty())
    println(namesAndScores.count())

    val bobData = mutableMapOf("name" to "Bob", "profession" to "Card Player", "city" to "Oakland", "country" to "USA")
    println(bobData)

    bobData["profession"] = "MailMan"
    bobData.remove("city")
    println(bobData)

    // You can also extract the key and the value from a map in a for loop
    for( (player,score) in namesAndScores) {
        println("$player - $score")
    }

    // Another way to loop though the keys of a map
    for(player in namesAndScores.keys){
        println("$player , ${namesAndScores[player]}")
    }

    /*Maps
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

    /**
     * To choose the best collection to store our item, we need to compare them depeneding on the number of item we want to store and the type of operation we want to use
     * To calculate the computing time we use the notation:
     * 0(1) : excellent performance, it take the same amount of time to realize the operation, non depending of the number of item
     * 0(n) : linear to the number of item
     * 0( log n) : between 0(1) and 0(n), depending on a logarithm function.
     *
     * Array : Immutable, accessing really fast, but inserting/deleting need to create a new array
     * accessing by index 0(1)
     * Inserting / Deleting : 0(1)
     *
     * Lists: accessing by index as array, to instert/delete in the middle of the list we need to shifted over the others item to make room, expensive operation
     * accessing by index 0(1)
     * Inserting / Deleting : 0(n)
     *
     * Map: Non ordered collection. Useful if we need to search a item by a criteria , not by a index. Inserting/Deleting are also fast.
     * Accessing by key 0(N)
     * Accessing by index: N/A
     * Inserting / Deleting : 0(1)
     *
     * For big collections, choose arrays if order matters, choose map if you search freqently by key, choose lists if you need to add/remove items
     * For small collections: use what feels natural
     *
     */

    // 4 - 36 Mutable vs Immutable

    // When you don't want to change the value of a variable , use val insted or var.
    // Also use immutable collection like List instead of ArrayList for collection variable
    // This way you are sure to not commit mistake
    val nameList= ArrayList<String> ()
    nameList.add("Sam")
    nameList.add("Fred")

    fun printNames(names: List<String>) {
        println(names)
    }
    printNames(nameList)

    val myName = "Sam"
    // myName = "Fred" This is forbidden

    println(myName)

    // Part 5  Lambda.
    // High order function are function that accept function as a argument, or can return a function

    val intList = listOf( 10 , 20 ,30)
    println( intList.filter { it > 10})

    fun List<Int>.filter( operator: (Int) -> Boolean) {

    }

    var myStringList = listOf("Sam", "Suzzy", "Jesse", "Ray", "Kevin")
    val updatedList = myStringList.filter { it.length > 3}.sortedBy { it }
    println(updatedList)

    fun handleInteger(myInt: Int, operation: (Int) -> Unit){
        operation(myInt)
    }

    handleInteger(5, {println("My result is ${it*10}")}) // We can define a function like this
    handleInteger(5, {myType -> println("My result is ${myType*10}")}) // myType is send to the function println
    handleInteger(5, {_ -> println("My result is ${10}")}) // _ means that you don't use a variable

    fun printResult(myInt: Int) {
        println("My int is $myInt")
    }

    handleInteger(4, ::printResult) // You can also call function like this, :: will pass the parameter to the function

    /**
     * Sum all the integers in the list that are
     * greater than 5 and print out the result
     */
    // Your Solution Here
    var myList = listOf<Int>( 2,3,4,9,15)
    //println(myList.filter { it > 5 }.sum())

    /**
     * Given the Person class below, destructuring
     * the name and age
     */
    data class Person(val name: String, val age: Int)
    val samy = Person("Sam", 30)

    val (name, age) = samy
    println("$name is $age years old")
    /**
     * Print out the index and value of the map below
     */
    val listOfPerson = mapOf<String, Int>("John" to 34, "Fred" to 24, "Sam" to 30, "Suzzy" to 29)

    // Your Solution Here
    listOfPerson.forEach { name, age ->print("$name is $age years old ")}

    // Part 5 42 Generic
    // Generic is use to create generic variable and function, it make life easier if we can write code that work independently from the type of the variable
    val bnames = ArrayList<String>()
    val myNumbers = ArrayList<Number>()
    myNumbers.add(1)
    myNumbers.add(2.5)
    println(myNumbers)

    // look the creation of the interface at top of this file. We create a repository interface with two methods, that accept any type.
    // T means generic, but you can use another letter.

    fun <T> printItem(item: T) {
        println("printItem $item")
    }

    printItem("Test")
    printItem(1)

    // filter: return a list where each item matches the condition in the lambda
    // indexOfFirst: return the first item that matches the lambda
    // map returns a list that has been transformed by the lambda function
    // all return true if all elements pass the lambda's test
    // any return true if any element pass the lambda's test

    val valueList = listOf(24,5,10,4)
    println(valueList.filter { it > 5})

    myStringList = listOf("Sam", "Suzzy", "Jesse", "Samuel", "Kevin")
    println(myStringList.first {it.length > 5})

    val cities = listOf("Los Angeles", "San Francisco", "New York", "San Antonio")
    println(cities.any { it == "San Antonio"})
    println(cities.all { it.length > 6})

    // Part 6 Classes
    // Classes have properties and methods
    // Creation / Initializers / Inherithence / When should you subclass / Data Classes



}