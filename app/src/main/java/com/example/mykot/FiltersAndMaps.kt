package com.example.mykot

fun main() {

    var values = listOf<Int>(10, 20)
    var evens = values.filter { it % 2 == 0 }
    println(evens)

    var doubleValues = evens.map { it * 2 }
    doubleValues.forEach { println(it) }

    var results = values.filter { it % 2 == 0 }.map { it * 2 }
    results.forEach { println(it) }
}

data class FilterAndMapsData(var name: String, var number: Long)