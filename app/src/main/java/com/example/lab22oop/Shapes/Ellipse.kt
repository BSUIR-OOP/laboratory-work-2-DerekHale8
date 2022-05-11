package com.example.lab22oop.Shapes

import android.graphics.PointF
import kotlin.math.*

class Ellipse(A: PointF, B: PointF):BaseFigure() {
    override fun clearPointsList() {
        if(pointsList.size!=0)
            pointsList.clear()
    }

    init{
        clearPointsList();
        //val r= sqrt((B.x-A.x).pow(2)+(B.y-A.y).pow(2))
        pointsList.add(PointF(A.x,A.y-B.y));
        for(u in 0..360) {
            pointsList.add(PointF((A.x + B.x * sin(u * PI / 180)).toFloat(), (A.y - B.y * cos(u * PI / 180)).toFloat()))
        }

    }
}