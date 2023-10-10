fun main() {
    //sampleStart
    val d: Int
    val check = true
    if (check) {
    d = 1
    } else {
    d = 2
    }
    println(d)

    val obj = "Hello"
when (obj) {
// Checks whether obj equals to "1"
"1" -> println("One")
// Checks whether obj equals to "Hello"
"Hello" -> println("Greeting")
// Default statement
else -> println("Unknown")
}



for (number in 1..5) {
    // number is the iterator and 1..5 is the range
    print(number)
    }


    var cakesEaten = 0
while (cakesEaten < 3) {
println("Eat a cake")
cakesEaten++
}
    // 1
    //sampleEnd
    }