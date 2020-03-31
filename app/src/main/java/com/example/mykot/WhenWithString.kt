package com.example.mykot

fun main() {

    var color: String = "Red"

    when (color) {

        "Red" -> {                          // If more than one line to execute then use curly braces { }
            println("It's Red!!")
            println("Ohh It's Red!!")
        }

        "White" -> println("It's White")    // Here, No need since it's one line execution

        else -> println(" Color didn't match.Please try again...")
    }
}