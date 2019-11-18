/**
 * Create a Shape interface with 2 integer properties named:
 * width, height.
 * Add a function named draw
 */

// Your Solution Here
interface  Shape {
    var width : Double
    var height: Double
    fun draw()
}

/**
 * Create a Circle that takes these values in the constructor and implements the Shape
 * Interface
 */
// Your Solution Here
class Circle(): Shape {
    override var width: Double = 0.0
    override var height: Double = 0.0
    override fun draw() {
        println("Draw Circle $width $height")
    }
}

/**
 * Create a Line that takes these values in the constructor and implements the Shape
 * Interface
 */
// Your Solution Here
class Line ( override val width: Double, override val height: Double): Shape {
    override fun draw() {
        println("Draw Line $width $height")
    }
}

/**
 * Create a function named printShape that takes a shape and calls the draw method
 */
// Your Solution Here
fun printShape(shape: Shape){
    shape.draw()
}

/**
 * Create a circle and a line and call printShape on both
 */
fun main(args: Array<String>) {
    // Your Solution Here
    var circle = Circle()
    circle.height = 0.5
    circle.width = 1.6

    val line = Line(5.2,6.3)

    circle.draw()
    line.draw()
}
