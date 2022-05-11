package com.example.lab22oop.Shapes

import android.graphics.PointF

abstract class BaseFigure {
    abstract fun clearPointsList();
    var pointsList = mutableListOf<PointF>();
}