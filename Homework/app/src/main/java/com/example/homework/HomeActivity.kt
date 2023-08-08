package com.example.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        Toast.makeText(this, "로그인 되었습니다.", Toast.LENGTH_SHORT).show()

        val userID = intent.getStringExtra("userID")
        val userName = intent.getStringExtra("userName")
        val userAge = intent.getStringExtra("userAge")

        val Text1 = findViewById<TextView>(R.id.textView_1)
        Text1.text = "ID: $userID"
        val Text2 = findViewById<TextView>(R.id.textView_2)
        Text2.text = "이름: $userName"
        val Text3 = findViewById<TextView>(R.id.textView_3)
        Text3.text = "나이 $userAge"

        val btn4 = findViewById<Button>(R.id.btn_4)
        btn4.setOnClickListener {
            finish()
        }
    }
}