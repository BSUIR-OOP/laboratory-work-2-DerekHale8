package com.example.lab22oop

import android.graphics.PointF
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.widget.Spinner
import android.widget.Toast
import com.example.lab22oop.Shapes.Line

class MainActivity : AppCompatActivity() {
    var i:Int=0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val shapeSpinner: Spinner =findViewById(R.id.spFigures)
        val myPathView:PathView=findViewById(R.id.pathView)
        myPathView.setSpinner(shapeSpinner)
    }

}