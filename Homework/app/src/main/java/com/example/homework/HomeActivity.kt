package com.example.homework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        Toast.makeText(this, "로그인 되었습니다.", Toast.LENGTH_SHORT).show()

        val userID = intent.getStringExtra("userID")


        val Text1 = findViewById<TextView>(R.id.textView_1)
        Text1.text = "ID: $userID"

        val btn4 = findViewById<Button>(R.id.btn_4)
        btn4.setOnClickListener {
            finish()
        }

    }

}