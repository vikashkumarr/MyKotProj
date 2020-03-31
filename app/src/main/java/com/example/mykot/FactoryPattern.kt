package com.example.mykot

fun main() {

    var obj = FactoryPattern.create()
    obj.show()
}

class FactoryPattern {

    companion object {
        // We're not creating object directly instead we're using Factory pattern
        fun create(): FactoryPattern = FactoryPattern()
    }

    fun show() {
        println("In Show")
    }
}