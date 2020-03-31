package com.example.mykot

fun main() {

    var obj = BackTickUse()
    obj.`in`()
}

class BackTickUse {

    // Since we can't use Kotlin keyword as a method that's why we're using backtick (' ' )
    fun `in`(){
        println("Backtick Call")
    }
}