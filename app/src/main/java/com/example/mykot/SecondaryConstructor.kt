package com.example.mykot

fun main() {

    var obj = SecondaryConstructorTest(27, "Vikash")
    obj.think()

}

class SecondaryConstructorTest(var name: String) {

    var age : Int = 0
    var myName : String = name

    constructor(age : Int, myName: String) : this(myName){
        this.age = age
    }

    fun think(){

        println("My name is $name and my age is $age")
    }
}