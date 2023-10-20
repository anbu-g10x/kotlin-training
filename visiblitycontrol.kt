open class A() {
    private val i = 1
    
    fun doSomething(){
       println("Inside doSomething" )
       println("Value of i is $i" )
    }
 }
 class B : A() {
    fun printValue(){
        doSomething()
        // println("Value of i is $i" )
    }
 }
 
 fun main(args: Array<String>) {  
    val a = A()
    val b = B()
    
    b.printValue()
 }

 open class A() {
    protected val i = 1
    
    protected fun doSomething(){
       println("Inside doSomething" )
       println("Value of i is $i" )
    }
 }
 class B : A() {
    fun printValue(){
        doSomething()
        println("Value of i is $i" )
    }
 }
 
 fun main(args: Array<String>) {  
    val a = A()
    val b = B()
    
    //a.doSomething()
    
    b.printValue()
 } 

package one

internal class InternalExample {
}

class publicExample{
    internal val i = 1

    internal fun doSomething() {
    }
}
 
//  public <--- Class b <--- Class A

// private

// protected

// internal