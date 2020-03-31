package learninglambdahighrorder

fun main() {

    val obj = MySum()

    // obj.addTwoNumbers(100,100,{fNum,sNum -> fNum + sNum})                          // Lambda Expression [ Function ]
    obj.addTwoNumbers(50, 50) { firstNum, secondNum -> firstNum + secondNum }     // Lambda Expression [ Function ]
}

class MySum {

    fun addTwoNumbers(num1: Int, num2: Int, action: (Int, Int) -> Int) {                       // High Level Function with Lambda as Parameter
        val result = action(num1, num2)  // In result we're returning a value as Int
        println(result)

    }
}