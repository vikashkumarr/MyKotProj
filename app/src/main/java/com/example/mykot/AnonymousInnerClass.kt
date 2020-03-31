package com.example.mykot

fun main() {

    var obj: ImplementIt = object : ImplementIt {
        override fun show() {
            println("Its Implemented")
        }
    }
    obj.show()
}

interface ImplementIt {
    fun show()
}