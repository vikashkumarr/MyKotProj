package com.example.mykot

fun main() {

    var listValue = listOf<Int>(10, 20, 20, 30, 40, 50)  // It's Immutable
    // listValue.add()                              // It's not possible here because it's not Mutable

    var mutableValues: MutableList<Int> = mutableListOf<Int>(1, 2, 3, 4, 5)
    mutableValues.add(
        1,
        20
    )                            // Now you can use add() method Since it's mutable now
    println()
    for (mutableVal in mutableValues)
        print("$mutableVal \t")

    for (value in listValue)
        print("$value \t")
}