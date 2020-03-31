package com.example.mykot

fun main() {

var obj = Doctor()
    obj.think()
    obj.talk()

}

abstract class Human {

    abstract fun think()

    fun talk() {

        println("Talking...")
    }
}

class Doctor : Human() {
    override fun think() {
        println("Critical thinking...")
    }

}