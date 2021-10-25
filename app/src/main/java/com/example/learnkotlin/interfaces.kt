package com.example.learnkotlin

interface First {
    fun display(){
        println("First")
    }
}

interface Second{
    fun display(){
        println("Second")
    }
}

class Third:First,Second{
    override fun display(){
        super<Second>.display()
    }
}

fun main(){

    var third = Third();
    third.display();
}