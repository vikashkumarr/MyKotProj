package com.example.mykot

fun main() {

    var obj1 = InfixFunctionTest()
    obj1.name = "Java"
    obj1.show()

    var obj2 = InfixFunctionTest()
    obj2.name = "Android"
    obj2.show()

    var obj3 = obj1 plus obj2  // u can give any name instead of "plus" like add or minus etc.
    obj3.show()
}

infix fun InfixFunctionTest.plus(myName: InfixFunctionTest): InfixFunctionTest {
    var bothName = InfixFunctionTest()
    bothName.name = this.name + " " + myName.name
    return bothName
}

class InfixFunctionTest {

    var name = ""
    fun show() {
        println(name)
    }
}

            // Infix Function
// 1. Function should be member function or external function
// 2. Only one parameter accepted ( Not 0 or not more than 1