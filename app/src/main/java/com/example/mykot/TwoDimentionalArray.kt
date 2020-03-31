package com.example.mykot

fun main() {

    var twoDimentionalArray = arrayOf(
        arrayOf(1, 2), arrayOf(1, 2)
    )

    for (i in twoDimentionalArray) {
           for (j in i) {
            print(j)
        }
        println()
    }
}