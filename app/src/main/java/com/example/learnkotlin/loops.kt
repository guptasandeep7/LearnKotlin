package com.example.learnkotlin



fun main() {
//    for(i in 1..3){
//        println(i)
//    }
//
//    for(i in 3 downTo 1){
//        println(i)
//    }
//
//    val a = 3;
//
//    when(a)
//    {
//        in 1..2-> println("Yes")
//        else-> println("no")
//    }
//
    val arr = arrayOf(1,2,3,4,5)

    arr.filter { it%2==0 }.forEach { println("$it") }
}