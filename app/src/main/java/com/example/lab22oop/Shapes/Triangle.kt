package com.example.lab22oop.Shapes

import android.graphics.PointF

class Triangle(A: PointF,B:PointF,C:PointF):BaseFigure() {
    override fun clearPointsList() {
        if(pointsList.size!=0)
            pointsList.clear()
    }

    init{
        clearPointsList();
        pointsList.add(PointF(A.x,A.y))
        pointsList.add(PointF(B.x,B.y))
        pointsList.add(PointF(C.x,C.y))
        pointsList.add(PointF(A.x,A.y))
    }
}