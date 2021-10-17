package com.example.imgswitcher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var img=findViewById<ImageView>(R.id.imgv)
        var b1=findViewById<Button>(R.id.b1)
        var b2=findViewById<Button>(R.id.b2)
        b1.setOnClickListener{
            img.setImageResource(R.drawable.download)
        }
        b2.setOnClickListener{
            img.setImageResource(R.drawable.img)
        }
    }
}