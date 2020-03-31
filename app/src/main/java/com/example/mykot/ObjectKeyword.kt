package com.example.mykot

fun main() {

    BookShell.books.add(Book("Java", 1000))
    BookShell.books.add(Book("Android", 2000))
    BookShell.books.add(Book("Kotlin", 3000))
    BookShell.showBooks()
}
// here object keyword is like Singleton in java that's why we're not creating object of the BookShell class. We're accessing directly with class name.
object BookShell {
    var books = arrayListOf<Book>()
    fun showBooks(){
        for (book in books)
            println(book)
    }
}
data class Book (var name : String, var price :Int)