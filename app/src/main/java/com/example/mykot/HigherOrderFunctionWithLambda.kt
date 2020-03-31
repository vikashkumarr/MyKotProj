package com.example.mykot

fun main() {
    // 1st Way
    val make: (String, String) -> String = { realName, heroName -> "$realName is now $heroName" }
    makeMyHero("Vikash Kumar","Viku Kumar", make)
    println()

    //2nd Way
    makeMyHero("Vikash Kumar","Vikuuu Kumar") { realName, heroName -> "$realName is now $heroName"}
    println()
}

fun makeMyHero(realName: String, heroName: String, make: (String, String) -> String) {

    val result = make(realName, heroName)
    print(result)
}
                            // Higher Order Function
// 1. Takes function as a parameter
// 2. returns a function
// 3. do both
                            // Lambda
// 1. Function with no name
// 2. Also called function literal