package com.example.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        Toast.makeText(this, "로그인 되었습니다.", Toast.LENGTH_SHORT).show()

        val btn4 = findViewById<Button>(R.id.btn_4)
        btn4.setOnClickListener {
            finish()
        }
    }
}