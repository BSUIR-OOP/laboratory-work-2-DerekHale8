package com.example.lab2oop

import android.graphics.Bitmap
import android.graphics.Canvas
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.SYSTEM_UI_FLAG_FULLSCREEN
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import com.example.lab2oop.Figures.Line
import com.example.lab2oop.Figures.Point
import com.example.lab2oop.CanvasView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //val myCanvasView=CanvasView(this)
        //val myCanvasView=CanvasView(this);
        val canvVi:CanvasView=findViewById(R.id.canvasView)

        //CanvasView.systemUiVisibility = SYSTEM_UI_FLAG_FULLSCREEN
        //val myCanvasView = CanvasView(this)
        //myCanvasView.systemUiVisibility = SYSTEM_UI_FLAG_FULLSCREEN
        //setContentView(myCanvasView)
        //val paintView: View =findViewById(R.id.canvasView)

        val spinner: Spinner =findViewById(R.id.spinner)

        val drawButton: Button =findViewById(R.id.button)

        val etAx: EditText =findViewById(R.id.etAx)
        val etAy: EditText =findViewById(R.id.etAy)
        val etBx: EditText =findViewById(R.id.etBx)
        val etBy: EditText =findViewById(R.id.etBy)
        val etCx: EditText =findViewById(R.id.etCx)
        val etCy: EditText =findViewById(R.id.etCy)

        val etWidth:EditText=findViewById(R.id.etWidth)
        val etHeight:EditText=findViewById(R.id.etHeight)

        val etF1:EditText=findViewById(R.id.etF1)
        val etF2:EditText=findViewById(R.id.etF2)

        val etLength:EditText=findViewById(R.id.etLength)
        val etRadius:EditText=findViewById(R.id.etRadius)


        drawButton.setOnClickListener {
            when (spinner.selectedItemPosition) {
                0 -> {
                    canvVi.drawLine(
                        etAx.getText().toString().toFloat(), etAy.getText().toString().toFloat(),
                        etBx.getText().toString().toFloat(), etBy.getText().toString().toFloat())
                }
                1->{
                    canvVi.drawTriangle(
                        etAx.getText().toString().toFloat(), etAy.getText().toString().toFloat(),
                        etBx.getText().toString().toFloat(), etBy.getText().toString().toFloat(),
                        etCx.getText().toString().toFloat(), etCy.getText().toString().toFloat()
                    )
                }
                2->{
                    canvVi.drawRectangle(
                        etAx.getText().toString().toFloat(),etAy.getText().toString().toFloat(),
                        etWidth.getText().toString().toFloat(),etHeight.getText().toString().toFloat()
                    )
                }
                3->{
                    canvVi.drawSquare(
                        etAx.getText().toString().toFloat(),etAy.getText().toString().toFloat(),
                        etLength.getText().toString().toFloat()
                    )
                }
                4->{
                    canvVi.drawEllipse(
                        etAx.getText().toString().toFloat(),etAy.getText().toString().toFloat(),
                        etF1.getText().toString().toFloat(),etF2.getText().toString().toFloat()
                    )
                }
                5->{
                    canvVi.drawCircle(
                        etAx.getText().toString().toFloat(),etAy.getText().toString().toFloat(),
                        etRadius.getText().toString().toFloat()
                    )
                }
            }
        }

    }









}
