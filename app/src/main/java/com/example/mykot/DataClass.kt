package com.example.mykot

fun main() {

    var lap1 = DataClass("Dell", 2000)
    println(lap1)
    var lap2 = DataClass("Dell", 2000)
    println(lap2)

    println(lap1 == lap2)
    println(lap1.equals(lap2))   // Like Java

// Copying lap1 object to lap4
    var lap4 = lap1.copy()
    println(lap4)

    // Even we can modify the property of the objec  and assign it to lap3
    var lap3 = lap1.copy(brand = "HP", price = 2500)
    println(lap3)

}
// This is like POJO/Model class in java but in Kotlin we don't need to override methods like toString(),hashCode,equals() and clone()
// By using data keyword as a Prefix would solve all problem
data class DataClass(val brand: String, val price: Int)