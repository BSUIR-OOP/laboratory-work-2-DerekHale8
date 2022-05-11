package com.example.lab22oop

import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path
import android.graphics.PointF
import android.widget.Spinner
import com.example.lab22oop.Shapes.Line
import com.example.lab22oop.Shapes.Triangle
import com.example.lab22oop.MainActivity
import com.example.lab22oop.Shapes.BaseFigure

class DrawShape(var Canvas: Canvas, var Path: Path, var Painter: Paint) {
    fun drawLine(x:Float,y:Float){
        //myPath.moveTo(x,y)
        Path.lineTo(x,y)
        Canvas.drawPath(Path,Painter)
        //myPath.close();
        Path.moveTo(x,y)

    }

    fun drawShape(shape: BaseFigure){
        for(i in 0..shape.pointsList.count()-1)(
                drawLine(shape.pointsList[i].x,shape.pointsList[i].y)
                )
    }
}