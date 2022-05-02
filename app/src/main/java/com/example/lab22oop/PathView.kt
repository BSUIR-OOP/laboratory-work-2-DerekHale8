package com.example.lab22oop

import android.app.ApplicationExitInfo
import android.content.Context
import android.graphics.*
import android.os.Bundle
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import android.widget.Spinner
import android.widget.Toast
import com.example.lab22oop.DrawShape
import com.example.lab22oop.MainActivity
import com.example.lab22oop.Shapes.*
import java.lang.NullPointerException
import kotlin.system.exitProcess


class PathView (context: Context,attrs: AttributeSet) : View(context,attrs){
    lateinit var shapeSpinner:Spinner ;

    fun setSpinner(spinner: Spinner){
        shapeSpinner=spinner;
    }

    private var extraBitmap: Bitmap=Bitmap.createBitmap(2400, 1800, Bitmap.Config.ARGB_8888)
    var extraCanvas: Canvas=Canvas(extraBitmap)
    var myPainter= Paint().apply{
        color= Color.RED;
        style=Paint.Style.STROKE
        isAntiAlias=true
        strokeWidth=4f
    }
    var myPath = Path()

    val pointList: ArrayList<PointF> = arrayListOf<PointF>()
    val shapeDrawer=DrawShape(extraCanvas,myPath,myPainter)


    override fun onDraw(canvas: Canvas) {
        super.onDraw(extraCanvas)
        canvas.drawBitmap(extraBitmap,0f,0f,null)
    }


    fun instanceShape(indexSpinner:Int):BaseFigure{
        when (indexSpinner) {
            0->return Line(pointList[0], pointList[1])
            1->return Triangle(pointList[0], pointList[1],pointList[2])
            2->return Rectangle(pointList[0], pointList[1])
            3->return Square(pointList[0], pointList[1])
            4->return Ellipse(pointList[0],pointList[1])
            5->return Circle(pointList[0],pointList[1])
            else -> return error("Index Spinner Error!");
        }
    }

    var o:Int=0;
    var isFull:Boolean=false;
    lateinit var shapeSelected:BaseFigure;

    override fun onTouchEvent(event: MotionEvent): Boolean {
        var x:Float=event.getX()
        var y:Float=event.getY()
        when (event.action) {
            MotionEvent.ACTION_DOWN -> {
                if(o==0) {
                    myPath.moveTo(x, y)
                    o = 1;
                }
                pointList.add(PointF(x,y))
                    try{
                        shapeSelected=instanceShape(shapeSpinner.selectedItemPosition)
                        isFull=true
                        }
                    catch(e:IndexOutOfBoundsException){
                        isFull=false;
                        return true;
                    }
                shapeDrawer.drawShape(shapeSelected)
                invalidate()
                return true
            }

            MotionEvent.ACTION_UP->{
                if(isFull==true) {
                    pointList.clear()
                    o=0;
                }
                invalidate()
                return true
            }

            else -> {
                return false
            }
        }
    }
}

