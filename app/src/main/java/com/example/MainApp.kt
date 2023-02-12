package com.example

class MainApp(
)

fun main(){
    val test = Tomteland()
    val list = mutableListOf<String>()
    test.getUnderlings("Myran",list)
    println(list)
}