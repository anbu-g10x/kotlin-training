class Student(name: String) {
    val regNo = 0 
    val name = name
    val age = 0;

    init {
        regNo = generateRegNo();
        name = name;
    }

    fun calculateMarks(){
        // TODO
    }

    fun calculateAttendance() {
        //Todo
    }

    fun isElgibileForVoting(){
        if(age > 18){
            return true
        }
        return false;
    }

    constructor(){
        
    }

    //Constructor (Parametrised)
    //Properties 
    //Functions / Behaviour
}

fun main(){
    val krupa =  Student() // Empty Object
    krupa.name = "Krupa"

    val aswathy = Student("aswathy")  //Paramterised Object

    if(krupa.isElgibileForVoting()){

    }
}