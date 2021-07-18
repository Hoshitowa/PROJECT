package Fox

fun main() {
//    println("Hello World")
//    Human().Hello()
//    val h = Human(66.5f , 1.7f)
    val h = Human(weight = 66.5f , height = 1.7f)
       println(h.bmi())
   /* var d =2
   var age : Int = 25
    age = age.plus(1)
    val weight = 65.5f;
    val enroll : Boolean = true
    println(age)*/
}
//class Human( var  weight : Float , var height : Float ,var name : String = "" ) {
class Human( var name : String = "" ,var  weight : Float , var height : Float  ) {
    init {
        println("test $weight")
    }
//    constructor(name:String, weight: Float, height: Float):this(weight,height)

    fun bmi() :Float {
        var  bmi = weight / (height*height)
        return bmi
    }

    fun Hello() {
        println("Hello Kotlin")

    }
}

