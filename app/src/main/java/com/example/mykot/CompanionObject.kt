package com.example.mykot

fun main() {

    CompanionObject.show()
}

class CompanionObject {

    // companion object is like static in java so no need to create object to call show() method
    companion object {
        @JvmStatic        // If you want to call this method from Java class then we have to provide @JvmStatic annotation otherwise we don't need
        fun show() {
            println("Show called")
        }
    }
}