// Inheritance
// In kotlin you can just use single inheritance, you cannont inherit from two different class
// To enable inheritance, you should use the keyword open to the class you want to inherit ( superclass or base class
// Student is a subclass or derived class from Person
fun main(args: Array<String>) {

    class Grade(var letter: Char, var points: Double, var credits: Double)

    open class Person(var firstName: String, var lastName: String)

    open class Student(firstName: String, lastName: String,var grades : ArrayList<Grade> = ArrayList()): Person(firstName, lastName){
        open fun recordGrade(grade: Grade){
            grades.add(grade)
        }
    }

    val john = Person("Johny", "AppleSeed")
    val jane = Student("Jane", "AppleSeed")

    println(john.firstName)
    println(jane.firstName)

    val history = Grade('B', points = 9.0, credits = 3.0)
    jane.recordGrade(history)

    // Class Hierarchy Person -> Student -> BandMember -> OboePlayer
    open class BandMember(firstName: String, lastName: String): Student(firstName,lastName){
        open var minimumPracticeTime = 2
    }

    // Polymorphism is a concept to treat an object differently based on the context
    class OboePlayer(firstName: String, lastName: String) : BandMember(firstName,lastName){
        override var minimumPracticeTime: Int
            get() {
                return super.minimumPracticeTime * 2
            }
        set(value){
            super.minimumPracticeTime = value / 2
        }
    }

    fun phonebookName(person: Person): String{
        return person.firstName + " " + person.lastName
    }
    val person = Person("Johny", "AppleSeed")
    val oboePlayer = OboePlayer("Jane", "AppleSeed")

    println(phonebookName(person))
    println(phonebookName(oboePlayer))

    var hallMonitor = Student("Jill", "Bananapeel")
    hallMonitor = oboePlayer
    //(oboePlayer as Student).minimumPracticeTime = 4 // This is a upcast. You can navigate to a upper class, but this fails because student don't have minimumPracticeTime
    (oboePlayer as BandMember).minimumPracticeTime = 4
    (hallMonitor as? BandMember)?.let {
        println("This hall monitor is a band member and pratices at least ${hallMonitor.minimumPracticeTime} hour per week")
    }

    // Function polymorphirm
    fun afterClassActivity(student: Student): String {
        return "Goes Home"
    }
    fun afterClassActivity(bandMember: BandMember): String {
        return "Play Guitar"
    }

    println(afterClassActivity(hallMonitor))// will call afterClassActivity(BandMember)
    println(afterClassActivity((oboePlayer as Student))) // will call afterClassActivity(student)

    class StudentAthlete(firstName: String, lastName: String): Student(firstName,lastName){
        var failedClasses = ArrayList<Grade>()

        override fun recordGrade(grade : Grade){
            super.recordGrade(grade)
            if(grade.letter == 'F'){
                failedClasses.add(grade)
            }
        }

        var isEligible : Boolean = true
        get() {
            return failedClasses.size  < 3
        }
    }

    // 51 When should you use Subclass:
    // Single responsability : Each class should have only a single concern
    // Type safety: give a separate type to the subclass, give hint to the compiler to raiser error
    // Shared base classes: put the common code on the root class, the specific code into many subclasses
    // Extensibility : extends the behaviour of code you don't own
    // Identity:
    // What object are: Choose to create classes & inheritance
    // What objects can do: Choose to use Interface


    // 52 Data classes (POJO)
    // Kotlin provide a keyword to specifies a classe as a pojo. It will generate all the getter,setter , hashcode and equals methods
    // The requirements are: Primary constructor with at least 1 parameter, also needs either val or var parameter. ALso cannot be abstract, open, sealed or inner
    // If you use val, you create a immutable data class, and dispose copy method to have a modified copy of this class

    data class Podcast(val title: String, val description: String, val url : String)

    val postcast = Podcast("Android Central", "The premier source of weekly news", "https//feeds.feedburner.com")
    val postcast2 = postcast.copy(title = "Developers Backstage")
    println(postcast)
    println(postcast2)

    val(title,description,url) = postcast2 // Destructuring a classe is easy in kotlin
    println("title = $title ,description= $description,url= $url")
}