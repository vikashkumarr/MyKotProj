package com.example.mykot

fun main() {

    var values = listOf<Int>(10, 20, 30, 40, 50)

// 1st Way
    values.forEach { n -> print("$n \t") }      // Here forEach() providing value to n one by one and then it's getting displayed
    println()

    //2nd Way
    values.forEach { print("${it}\t") }          // Here "it" represents the current Object
    println()

    // 3rd Way
    values.forEach(::print)
    println()

    // Using with mutableList
    var data: MutableList<EmployeeDataList> = mutableListOf()
    data.add(EmployeeDataList("Vikash", 575875))
    data.add(EmployeeDataList("Pranesh", 57879))
    data.forEach { println("Name: ${it.name} Number : ${it.number}") }
}

data class EmployeeDataList(var name: String, var number: Long)