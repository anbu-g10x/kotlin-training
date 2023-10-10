fun main() {
    //sampleStart
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println("The first item in the list is: ${readOnlyShapes[0]}")
    println("The last item in the list is: ${readOnlyShapes.last()}")// The first item in the list is: triangle
    println("This list has ${readOnlyShapes.count()} items")
    println("circle1" in readOnlyShapes)

    shapes.add("pentagon")
println(shapes)
// [triangle, square
    //sampleEnd
    }