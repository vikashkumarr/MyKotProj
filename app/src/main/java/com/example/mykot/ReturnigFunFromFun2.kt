package com.example.mykot

fun main() {

    // 1st Way
    val sum = printSum()
    sum(20,20)

    //2nd Way
    printSum()(10, 10)

}

fun printSum(): (Int, Int) -> Unit {    // Here Unit means "Not returning anything" like Void in Java

    return { a, b ->                    // Here a and b mapped to the (Int, Int)
        println(a + b)
    }
}