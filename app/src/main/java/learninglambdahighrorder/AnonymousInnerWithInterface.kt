package learninglambdahighrorder

fun main() {

    val demoObj = Demo()

    //Simple Way
    demoObj.addTwoNumbers(10, 10)

    // Using interface .. Like object-Oriented way
    demoObj.addTwoNumbers2(20, 20, object : ImplementIt {           // Passing interface as a parameter
        override fun show(sum: Int) {
            println("Using interface .. Like object-Oriented way -> $sum")          // Body of the method
        }
    })

    var lambda: (Int) -> Unit = { a: Int -> println(a) }
    demoObj.addTwoNumbers3(40, 40, lambda)
    // In a Single line
    demoObj.addTwoNumbers3(50, 50) { a: Int -> println(a) }          // Lambda as a parameter [Function]

}

class Demo {

    fun addTwoNumbers3(num1: Int, num2: Int, action: (Int) -> Unit) {             // High Level Function with Lambda as Parameter
        var sum = num1 + num2
        action(sum)
    }

    fun addTwoNumbers2(num1: Int, num2: Int, action: ImplementIt) {
        var sum = num1 + num2
        action.show(sum)
    }

    fun addTwoNumbers(num1: Int, num2: Int) {
        var sum = num1 + num2
        println("In Simple Way ->  $sum")
    }
}

interface ImplementIt {
    fun show(sum: Int)
}

// Here we're implementing anonymous inner class like in java