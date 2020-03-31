package com.example.mykot

fun main() {

    var value = 1;

    // While
    while (value < 5) {
        println("While $value")
        value++
    }

    // Do - While

    do {
        println("Do-While $value")
        value++
    } while (value < 7)
}