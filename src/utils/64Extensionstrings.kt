package utils

// You can add a new function to the class String!
// This in reality create a static function that you can use anywhere.
// this refer to the sting itself
fun String.lastChar() : Char = this.get(this.length -1)