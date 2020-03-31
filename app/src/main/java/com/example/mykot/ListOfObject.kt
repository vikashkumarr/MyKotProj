package com.example.mykot

fun main() {

    var employeeData = listOf<EmployeeData>(
        EmployeeData("Vikash", 9543909711),
        EmployeeData("Pranesh", 8220405098)
    )
    for (employee in employeeData)
        println("Employee Name:- ${employee.name} and Number:- ${employee.number}")

    // Mutable List
    var mutableList: MutableList<EmployeeData> = mutableListOf<EmployeeData>()
    mutableList.add(EmployeeData("VK", 686986))
    mutableList.add(EmployeeData("Pandu", 68678978))
    for (mutableData in mutableList)
        println("Emp Name: ${mutableData.name} and Num : ${mutableData.number}")
}

data class EmployeeData(var name: String, var number: Long)