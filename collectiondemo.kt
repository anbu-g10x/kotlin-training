fun main() {
//sampleStart
// Read only list
val readOnlyShapes = listOf("triangle", "square", "circle")
// Mutable list with explicit type declaration
val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
shapes[0] = "bye"
//sampleEnd
println(shapes)


val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
// Mutable set with explicit type declaration
val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
println(readOnlyFruit)


val readOnlyAccountBalances = mapOf(1 to 100, 2 to 100, 3 to 100)
// Mutable map with explicit type declaration
val accountBalances: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)

println(readOnlyAccountBalances.keys) --> All Keys
println(readOnlyAccountBalances.values) --> All Values


val readOnlyAccountBalances = mapOf(1 to 100, 2 to 100, 3 to 100)
println(2 in readOnlyAccountBalances.keys)
println(200 in readOnlyAccountBalances.values)

println("banana" in fruit) --> list / Set

println(accountBalances)
}