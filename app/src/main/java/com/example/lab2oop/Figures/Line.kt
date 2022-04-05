package com.example.lab2oop.Figures

import android.graphics.Canvas

open class Line(private val A: Point, private val B: Point): BaseFigure() {
    override fun print() {
        println("Line:((${A.xPos},${A.yPos}),(${B.xPos},${B.yPos}))");
    }

    override fun draw(canvas: Canvas){
        //canvas.apply{
            canvas.drawLine(A.xPos,A.yPos,B.xPos,B.yPos,painter)
       // }

    }
}