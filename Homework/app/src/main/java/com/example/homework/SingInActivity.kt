package com.example.homework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class SingInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_singinactivity)

        val btn1 = findViewById<Button>(R.id.btn_2)
        btn1.setOnClickListener{
            val intent = Intent(this, SignpActivity::class.java)
            startActivity(intent)
        }


        val btn2 = findViewById<Button>(R.id.btn_1)
        btn2.setOnClickListener{
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}