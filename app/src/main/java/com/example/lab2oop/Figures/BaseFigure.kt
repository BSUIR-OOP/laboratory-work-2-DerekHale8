package com.example.lab2oop.Figures

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint

abstract class BaseFigure {
    abstract fun print()
    abstract fun draw(canvas: Canvas)
    val painter= Paint().apply{
        color= Color.RED;
        style=Paint.Style.FILL
        isAntiAlias=true
        strokeWidth=4f
    }
}