package com.example.lab2oop.Figures

import android.graphics.Canvas

class Triangle(private val A: Point, private val B: Point, private val C: Point): Line(A,B) {
    override fun print() {
        println("Triangle:((${A.xPos},${A.yPos}),(${B.xPos},${B.yPos}),(${C.xPos},${C.yPos}))");
    }

    override fun draw(canvas: Canvas) {
        canvas.drawLines(floatArrayOf(A.yPos,A.yPos,B.xPos,B.yPos,C.xPos,C.yPos),painter)
    }
}