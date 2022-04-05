package com.example.lab2oop.Figures

import android.graphics.Canvas

open class Ellipse(private val A: Point, private val F1:Float, private val F2:Float): BaseFigure() {
    override fun print(){
        println("Ellipse:((${A.xPos},${A.yPos}),$F1,$F2)")
    }

    override fun draw(canvas: Canvas) {
        canvas.drawOval(A.xPos-F1,A.yPos+F2,A.xPos+F1,A.yPos-F2,painter)
    }
}