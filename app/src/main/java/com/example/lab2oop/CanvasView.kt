package com.example.lab2oop

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.util.AttributeSet
import android.view.View
import com.example.lab2oop.Figures.*

class CanvasView(context: Context,attrs: AttributeSet) : View(context,attrs) {
    //var extraCanvas: Canvas=Canvas(extraBitmap)
    private var extraBitmap: Bitmap=Bitmap.createBitmap(2400, 1800, Bitmap.Config.ARGB_8888)
    var extraCanvas: Canvas=Canvas(extraBitmap)
    /*
    override fun onSizeChanged(width: Int, height: Int, oldWidth: Int, oldHeight: Int) {
        super.onSizeChanged(width, height, oldWidth, oldHeight)
        if (::extraBitmap.isInitialized) extraBitmap.recycle()

        extraBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
        extraCanvas = Canvas(extraBitmap)
    }*/

    override fun onDraw(canvas: Canvas) {
        // Draw the bitmap that has the saved path.
        canvas.drawBitmap(extraBitmap, 0f, 0f, null)
        //canvas.drawColor(Color.BLACK)




    }

    fun drawLine(Ax:Float,Ay:Float,Bx:Float,By:Float){
        val pointA = Point(Ax,Ay);
        val pointB= Point(Bx,By);
        val instanceLine=Line(pointA,pointB)


        instanceLine.draw(extraCanvas);
    }

    fun drawTriangle(Ax:Float,Ay:Float,Bx:Float,By:Float,Cx:Float,Cy:Float){
        val pointA = Point(Ax,Ay);
        val pointB= Point(Bx,By);
        val pointC= Point(Cx,Cy);
        val instanceTriangle= Triangle(pointA,pointB,pointC)

        instanceTriangle.draw(extraCanvas);
    }

    fun drawRectangle(Ax:Float,Ay:Float,Width:Float,Height:Float){
        val pointA=Point(Ax,Ay)
        val instanceRectangle= Rectangle(pointA,Width,Height)

        instanceRectangle.draw(extraCanvas);
    }

    fun drawSquare(Ax:Float,Ay:Float,Length:Float){
        val pointA=Point(Ax,Ay)
        val instanceSquare= Square(pointA,Length)

        instanceSquare.draw(extraCanvas);

    }

    fun drawEllipse(Ax:Float,Ay:Float,F1:Float,F2:Float){
        val pointA=Point(Ax,Ay)
        val instanceEllipse=Ellipse(pointA,F1,F2)

        instanceEllipse.draw(extraCanvas);
    }

    fun drawCircle(Ax:Float,Ay:Float,Radius:Float){
        val pointA=Point(Ax,Ay)
        val instanceCircle=Circle(pointA,Radius)

        instanceCircle.draw(extraCanvas)
    }




}