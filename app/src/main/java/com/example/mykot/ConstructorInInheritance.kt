package com.example.mykot

fun main() {
    var obj : Blue = Blue(20)
    obj.show()
}

open class Color(age: Int) {
    init {
        println("it's Color Constructor $age")
    }

    open fun show() {
        println(" It's in Color Show")
    }
}

// We're passing age from child class to the super class using child class constructor like super in Java
class Blue(age : Int) : Color(age) {
    init {
        println("it's Blue Constructor $age")
    }

    override fun show() {
        println(" It's in Blue Show")
    }
}