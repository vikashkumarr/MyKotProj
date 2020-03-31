package learninglambdahighrorder

fun main() {

    val obj = LambdaClosuresDemo()
    var result = 0

    obj.addTwoNumbers(100, 100) { first, second ->
        result = first + second
        // println(result)                // We can print here as well
    }                                    // We're modifying result inside lambda expression we can't do that in Java
    println("It's Lambda Closures -> $result")
}

class LambdaClosuresDemo {

    fun addTwoNumbers(num1: Int, num2: Int, itsFunction: (Int, Int) -> Unit) {
       var print = itsFunction(num1, num2)
        println(print)
    }
}