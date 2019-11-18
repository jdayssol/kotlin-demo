/**
 *
 */
fun main(args: Array<String>) {
/* Pairs and Triples

 Declare a constant Pair that contains two Int values. Use this to represent a date (month, day).
 */
    val monthDay = Pair(12,5)
    println("Date $monthDay")

/*
 In one line, read the day and month values into two constants.
 */
    println("Month $monthDay.first Day $monthDay.second")

/*
 Now create a Triple using the month, day and year */
    val monthDayYear = Triple(12,5,2019)

    println("Month $monthDayYear.first Day $monthDayYear.second Year $monthDayYear.third")



}