//sampleStart
class InitOrderDemo(name: String) {
    val firstProperty = "First property: $name".also(::println)
    init {
    println("First initializer block that prints $name")
    }
    val secondProperty = "Second property: ${name.length}".also(::println)
    init {
    println("Second initializer block that prints ${name.length}")
    } 
}
    //sampleEnd
    fun main() { 
       val demo =   InitOrderDemo("hello")

        // val invoice = InitOrderDemo() // initialise of Object
// val customer = Customer("Joe Smith")
    }

//     Class members
// Classes can contain
// Constructors and initializer blocks Functions
// Properties
// Nested and inner classes
// Object declarations
