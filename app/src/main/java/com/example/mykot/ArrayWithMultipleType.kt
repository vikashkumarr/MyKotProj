package com.example.mykot

fun main() {

    var allTypes = arrayOf(
        1,
        2,
        "Vikash",
        true,
        10.5
    )   // If you don't specify type then you can store multiple data types value

    // var oneType = arrayOf<Int>(1, 2, 3, 4, 5)     // Here you can't put multiple types Since we've specify Int type only
    for (i in allTypes)
        println(i)
}