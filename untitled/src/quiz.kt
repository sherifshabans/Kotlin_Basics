/*Exercise Variables And Datatypes
Please write a program in which you are assigning those values to variables with the right (specific) data type:


 val android :String ="Android Masterclass"

val floatNum:Float=  13.37F

val doubleNumber :Double =3.14159265358979

val smallNum:Short= 25

val num :Short = 2020

val longNum:Long= 18881234567

val flag :Boolean=true

val char:Char= 'a'






Please don't simply use Kotlin's powerful type inference feature for this.
For example, write
var age : Short = 25
and not
var age = 25
even though both are correct. This is just for testing your understanding of the different basic data types.
All of them should be "var", except for the pi value and 13.37, use "val" here.
Try to use descriptive and useful names
* */




//------------------------------
/**Solution*/
/* var courseName :String = "Android Masterclass"
    val leet : Float = 13.37F
    val pi : Double = 3.14159265358979
    var age : Byte = 25
    var year : Short = 2020
    var phoneNumber: Long = 18881234567
    var isGood : Boolean = true
    var firstCharacter : Char = 'a'

* */



/*
//Arithmetic operators (+, -, *, /, %)
var result = 5+3
result = result / 2
// alternatively
// result /= 2
result = result * 5
result = result - 1
var moduloResult = 5%2
println( moduloResult)

//Comparison operators (==, !=, <, >, <=, >=)
val isEqual = 5==3
// Concatenation - adding of "Strings"
println("isEqual is " + isEqual)
val isNotEqual = 5!=5
// Kotlin has a feature called String Interpolation.
// This feature allows you to directly insert a template expression inside a String.
// Template expressions are tiny pieces of code that are evaluated and
// their results are concatenated with the original String.
// A template expression is prefixed with $ symbol.
// Following are examples of String interpolation
println("isNotEqual is $isNotEqual")

println("is5Greater3 ${5 > 3}")
println("is5LowerEqual3 ${5 >= 3}")
println("is5LowerEqual5 ${5 >= 5}")

//Assignment operators (+=, -=, *=, /=, %=)
var myNum = 5
myNum += 3
println("myNum is $myNum")
myNum *= 4
println("myNum is $myNum")


//Increment & Decrement operators (++, --)
myNum++
println("myNum is $myNum")
// increments after use
println("myNum is ${myNum++}")
// increments before use
println("myNum is ${++myNum}")
println("myNum is ${--myNum}")

*/


//loops
/*
Write a for loop that runs from 0 to 10000
Once it's at 9001 it should write "IT'S OVER 9000!!!"



Write a while loop that checks the humidity (not the humidityLevel).
The variable humidityLevel starts at 80. The variable humidity is initialized with "humid".
If it is "humid" then it should reduce the "humidityLevel" by 5 and print "humidity decreased"
Once the humidityLevel is below 60 it should print "it's comfy now" and set the humidity to "comfy"
*/
//---------------------
/**Solution*/


/*
for(num in 1..10000) {
    if(num == 9001)
        print("IT'S OVER 9000!!!")
}
As usual, there are many different solution for this :)

var humidity = "humid"
var humidityLevel = 80
while (humidity == "humid"){
    humidityLevel-=5
    println("humidity decreased")
    if(humidityLevel < 60){
        humidity = "comfy"
        println("it's comfy now")
    }
}
*/


//Nullables
/*
// NULLABLES/OPTIONALS in Kotlin
// Kotlin supports nullability as part of its type System.
// That means You have the ability to declare whether
// a variable can hold a null value or not.
// By supporting nullability in the type system,
// the compiler can detect
// possible NullPointerException errors at compile time
// and reduce the possibility of having them thrown at runtime.
var name: String = "Denis"
// name = null // Compilation Error

var nullableName: String? = "Denis"
nullableName = null // Works

// Here name cannot/must not be null
val len = name.length
val upper = name.toLowerCase()

// but the same methods won't work on nullable types
val len2 = nullableName.length // Compilation Error
val upper2 = nullableName.toLowerCase()  // Compilation Error

// So how can we solve this? We could do a null check before hand

val nullableName2: String? = "Denis"

if(nullableName2 != null) {
    println("Hello, ${nullableName2.toLowerCase()}.")
    println("Your name is ${nullableName2.length} characters long.")
} else {
    println("Hello, Guest")
}

// This works but seems to be quite some work...
// So how about we shorten the syntax...
// Kotlin provides a Safe call operator, ?.
// It allows you to combine a null-check and
// a method call in a single expression.

nullableName2?.toLowerCase()

// This is the same as:
if(nullableName2 != null)
nullableName2.toLowerCase()
else
null

// You can use methods on a nullable variable like this
val nullableName3: String? = null

println(nullableName3?.toLowerCase()) // prints null
println(nullableName3?.length) // prints null

// You can perform a chain safe calls:
//val wifesAge: String? = user?.wife?.age


// Let'S say we don’t want to print anything if
// the variable is null?

// In order to perform an operation only if the
// variable is not null, we can use the safe call
// operator with let -

val nullableName4: String? = null

nullableName4?.let { println(it.toLowerCase()) }
nullableName4?.let { println(it.length) }
// Prints nothing because there nullableName is null
// and we used let to prevent anything from being performed


// What if we would like to enter a default value?
// Then we can use the elvis operator ?:
val name2 = nullableName4 ?: "Guest"

//val wifesAge2: String? = user?.wife?.age ?:0

// Not null assertion : !! Operator
// The !! operator converts a nullable type to a
// non-null type, and throws a NullPointerException
// if the nullable type holds a null value.
// This is risky, and you should only use it if
// you are 100% certain, that there will be a value in
// the variable.
val nullableName5:String? = null
nullableName5!!.toLowerCase() // Results in NullPointerException

*/

