/**
 *
 */
fun main(args: Array<String>) {
/*
 ### MORE Nullables
 
 Using your `myFavoriteSong` variable from the previous challenge,
 use nullable safe calls and let to check if it contains a value.
 If it does, print out the value. If it doesn’t, print "I don’t have a favorite song."
 */

    // Your solution here
    var myFavoriteSong : String? = "Song"
    //myFavoriteSong = null
    if(myFavoriteSong != null){
        println("myFavoriteSong $myFavoriteSong")
    }else{
        println("i don t have favorite song")
    }

    myFavoriteSong?.let {println("myFavoriteSong $myFavoriteSong")} ?: println("i don t have favorite song")


/*
 Write a function called `printNickname` that takes a Nullable String as a parameter.
 Use the `let` method to try to unwrap the nickname, and if it fails print an error
 and return. Otherwise, print the unwrapped nickname.
 */
    // Your solution here
    fun printNickname( nickName : String?) {
    nickName?.let {println("$it")} ?: println("error")
}
    printNickname(nickName = null)
    printNickname(nickName = "Jo")
}