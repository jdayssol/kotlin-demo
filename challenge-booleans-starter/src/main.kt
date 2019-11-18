/**
 *
 */
fun main(args: Array<String>) {
/*
 BOOLEANS
 Create a constant called `myAge` and set it to your age.
 Then, create a constant called `isTeenager` that uses Boolean logic
 to determine if the age denotes someone in the age range of 13 to 19.
 */
    val myAge : Int = 37
    val isTeenager : Boolean
    if(myAge <= 19 && myAge >= 13 ){
        isTeenager = true
    }else{
        isTeenager = false
    }
    println("isTeenager $isTeenager");
/*
 Create another constant called `theirAge` and set it to the age of an person which is 30.
 Then, create a constant called `bothTeenagers` that uses
 Boolean logic to determine if both you and him are teenagers.
 */
    val theirAge : Int = 30
    val bothTeenager : Boolean

    fun isTeenager( age: Int) : Boolean {
        return age <= 19 && age >= 13
    }

    if(isTeenager(myAge) && isTeenager(theirAge)) {
        bothTeenager = true
    }else{
        bothTeenager = false
    }
    println("bothTeenager $bothTeenager");
/*
 Create a constant called student and set it to your name as a string.
 Create a constant called author and set it to Kevin Moore.
 Create a constant called `authorIsStudent` that uses string equality
 to determine if student and author are equal.
 */

    val student = "Joseph"
    val author = "Kevin Moore"
    val authorIsStudent = (student == author)
    println("authorIsStudent $authorIsStudent")
/*
 Create a constant called `studentBeforeAuthor` which uses string
 comparison to determine if student comes before author.
 */

    val studentBeforeAuthor = student < author
    println("studentBeforeAuthor $studentBeforeAuthor")
/*
 IF STATEMENTS AND BOOLEANS
 Use the constant called `myAge` and initialize it with your age.
 Write an if statement to print out Teenager if your age is between 13 and 19,
 and Not a teenager if your age is not between 13 and 19.
 */

    if(isTeenager(myAge)){
        println("Teenager")
    }else{
        println("Not a teenager")
    }

/*
 Create a constant called `answer` and an if expression to set it
 equal to the result you print out for the same cases in the above exercise.
 Then print out answer.
 */

    val answer = if(isTeenager(myAge)) "Teenager" else "Not a teenager"
    println("answer $answer")

}