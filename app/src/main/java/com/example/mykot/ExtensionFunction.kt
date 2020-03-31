package com.example.mykot

fun main() {

    var obj1 = ExtensionFunctionTest()
    obj1.name = "Java"

    obj1.display()

    var obj2 = ExtensionFunctionTest()
    obj2.name = "Kotlin"
    obj2.display()

    var obj3 = obj1.plus(obj2)  // u can give any name instead of "plus" like add or minus etc.
    obj3.display()

}

fun ExtensionFunctionTest.plus(a: ExtensionFunctionTest): ExtensionFunctionTest {
    var bothName = ExtensionFunctionTest()
    bothName.name = this.name + " " + a.name
    return bothName
}

class ExtensionFunctionTest {

    var name = ""

    fun display() {
        println(name)
    }

}