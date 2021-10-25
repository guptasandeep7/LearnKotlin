package com.example.learnkotlin

class Person(var firstName: String, val lastName: String) {
    init {

    }
    constructor(firstName: String) : this(firstName,""){
        this.firstName = firstName;
    }

    fun printName(){
        println(firstName)
        println(lastName)
    }
}

fun main(){
    val person = Person("Sandeep","Gupta")
//    print(person.firstName)
//    print(person.lastName)
    person.firstName = "hello"
//    print(person.firstName)
    val newPerson = Person("Rishabh singh")
    person.printName()
    newPerson.printName()


}
