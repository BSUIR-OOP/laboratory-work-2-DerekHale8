package com.example.lab2oop.Figures

open class Square(private val A: Point, private val Length:Float): Rectangle(A,Length,Length) {
    override fun print(){
        println("Square:((${A.xPos},${A.yPos}),$Length)")
    }

}