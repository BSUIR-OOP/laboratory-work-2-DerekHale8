package com.example.lab2oop.Figures

import android.graphics.Canvas

open class Rectangle(private val A: Point, private val Width:Float, private val Height:Float): BaseFigure() {
    override fun print(){
        println("Rectangle:((${A.xPos},${A.yPos}),${A.xPos+Width},${A.yPos+Height})")
    }

    override fun draw(canvas: Canvas) {
        canvas.drawRect(A.xPos,A.yPos+2*Height,A.xPos+2*Width,A.yPos,painter)
    }
}