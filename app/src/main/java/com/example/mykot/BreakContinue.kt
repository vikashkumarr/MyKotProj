package com.example.mykot

fun main() {

    loop@for (show in 1..5) {
        if (show == 3) {
             break@loop
        }
        println(show)
    }

   loop@ for (show in 1..5) {
        if (show == 2) {
            continue@loop
        }
        println(show)
    }
}