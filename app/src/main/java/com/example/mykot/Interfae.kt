package com.example.mykot

fun main(){
    var obj = Implementation()
    obj.display()
    obj.show()
    obj.getIt()
}
interface Interfae {
    fun show()
    fun display() {
        println("Display in Interface")
    }
}

interface SecondInf {
    fun getIt()
    fun display() {
        println("Display in SecondInf")
    }
}

class Implementation : Interfae, SecondInf {
    override fun show() {
        println("In Show")
    }

    override fun getIt() {
        println("In getIt")
    }

    override fun display() {
//        println("In Display")
        super<SecondInf>.display()
    }
}