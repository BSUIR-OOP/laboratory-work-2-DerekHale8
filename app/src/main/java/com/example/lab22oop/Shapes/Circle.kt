package com.example.lab22oop.Shapes

import android.graphics.PointF
import kotlin.math.*

class Circle(val A: PointF, val B: PointF):BaseFigure() {
    override fun clearPointsList() {
        if(pointsList.size!=0)
            pointsList.clear()
    }

    init{
        clearPointsList();
        val r=sqrt((B.x-A.x).pow(2)+(B.y-A.y).pow(2))
        pointsList.add(PointF(A.x,A.y - r));
        for (a in(0..360)){
            pointsList.add(PointF((A.x + r * sin(a * PI / 180)).toFloat(), A.y - r * cos(a * PI / 180).toFloat()));
        }
        pointsList.add(PointF(A.x,A.y - r));

    }

}