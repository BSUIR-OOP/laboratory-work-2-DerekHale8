package com.example.lab2oop.Figures

import android.graphics.Canvas

class Circle(private val A: Point, private val Radius:Float): Ellipse(A,Radius,Radius){
    override fun print(){
        println("Circle:((${A.xPos},${A.yPos}),$Radius)")
    }

    /*override fun draw(canvas: Canvas) {
        canvas.drawCircle(A.xPos,A.yPos,Radius,painter)
    }*/
}