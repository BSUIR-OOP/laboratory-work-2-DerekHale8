package com.example.lab22oop.Shapes

import android.graphics.PointF

class Square(A: PointF,B:PointF):BaseFigure() {
    override fun clearPointsList() {
        if(pointsList.size!=0)
            pointsList.clear()
    }

    init{
        clearPointsList()
        pointsList.add(PointF(A.x-(B.x-A.x),A.y+(B.y-A.y)))
        pointsList.add(PointF(A.x-(B.x-A.x),A.y-(B.y-A.y)))
        pointsList.add(PointF(A.x+(B.x-A.x),A.y-(B.y-A.y)))
        pointsList.add(PointF(A.x+(B.x-A.x),A.y+(B.y-A.y)))
        pointsList.add(PointF(A.x-(B.x-A.x),A.y+(B.y-A.y)))
    }
}