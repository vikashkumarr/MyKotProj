package learninglambdahighrorder

fun main() {
    var person = Person()
    // Use of with
    with(person) {
        name = "Vikash"
        age = 27
    }
    // Use of apply
    person.apply {
        name = "Kumar"
        age = 28
    }.startRun()

    println(person.name)
    println(person.age)
}

class Person {
    var name: String = ""
    var age: Int = -1
    fun startRun() {
        println("Now I am ready to run")
    }
}