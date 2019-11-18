// the enum class is useful to declare a fixed set of options
// It is more secure in Kotlin because you have the power of the class behind it.

enum class Direction {
    NORTH, SOUTH, WEST , EAST;

    fun printDirection() {
        println("I am goind $this")
    }
}
enum class Color( val r: Int, f : Int, b : Int) {
    RED(255,0,0),
    YELLOW(255,255,0),
    GREEN(0,255,0)
}

fun drive(direction:Direction) {
    when(direction) {
        Direction.NORTH -> println("Driving NORTH")
        Direction.SOUTH -> println("Driving SOUTH")
        Direction.WEST -> println("Driving WEST")
        Direction.EAST -> println("Driving EAST")
    }
}

fun main(args:  Array<String>) {
    drive(Direction.NORTH)
    drive(Direction.SOUTH)
    drive(Direction.WEST)
    drive(Direction.EAST)

    println(Direction.valueOf("NORTH"))
    // println(Direction.valueOf("dd")) will throw Exception in thread "main" java.lang.IllegalArgumentException: No enum constant Direction.dd
    println(Direction.NORTH.ordinal) // Position in the enum

    Direction.WEST.printDirection()
}