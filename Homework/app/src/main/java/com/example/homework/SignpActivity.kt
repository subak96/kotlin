package com.example.homework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signp)

        val btn3 = findViewById<Button>(R.id.btn_3)
        btn3.setOnClickListener {
            val editTextName = findViewById<EditText>(R.id.Password_1)
            val editTextPassword = findViewById<EditText>(R.id.Password_2)
            val editTextID = findViewById<EditText>(R.id.Password_3)
            val editTextAge = findViewById<EditText>(R.id.Password_4)

            val useID = editTextID.text.toString()
            val useName = editTextName.text.toString()
            val usePassword = editTextPassword.text.toString()
            val useAge = editTextAge.text.toString()

            if (useID.isEmpty() || useName.isEmpty() || usePassword.isEmpty() || useAge.isEmpty()){
                Toast.makeText(this, "정보를 모두 입력해주세요", Toast.LENGTH_SHORT).show()
            }
            else {
                val intent = Intent(this, SingInActivity::class.java)
                startActivity(intent)
            }
        }
    }
}