package com.example.imadpracticum

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
            //ST10511080 - Shahaan Khan
        }
        val ntAid = findViewById<EditText>(R.id.ntAid)
        val ntFood = findViewById<EditText>(R.id.ntFood)
        val ntShelt = findViewById<EditText>(R.id.ntShelt)
        val qtAid = findViewById<EditText>(R.id.qtAid)
        val qtFood = findViewById<EditText>(R.id.qtFood)
        val Ttl = findViewById<TextView>(R.id.Ttl)
        val inTtl = findViewById<EditText>(R.id.inTtl)
        val inShelt = findViewById<EditText>(R.id.inShelt)
        val inFood = findViewById<EditText>(R.id.inFood)
        val inAid = findViewById<EditText>(R.id.inAid)
        val qtShelt = findViewById<EditText>(R.id.qtShelt)

        val btnAdGear = findViewById<Button>(R.id.btnAdGear)
        val btnDView = findViewById<Button>(R.id.btnDView)

    }

}