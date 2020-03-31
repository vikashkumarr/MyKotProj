package com.example.mykot

fun main() {

    // 1st Way
    val x = initialSum()            // Here x is method
    val y = x(10, 10)               // We're passing (Int, Int) parameter to the method and it will get 20 as a return value
    println(y)

    //2nd Way
    println(initialSum()(5,5))
}

fun initialSum(): (Int, Int) -> Int {

    return { a, b ->
        a + b                       // It will return 20
    }
}

// Let's assume a scenario where you don't need a return value rather you just want to print the value there itself.
// Check ReturnigFunFromFun2.kt