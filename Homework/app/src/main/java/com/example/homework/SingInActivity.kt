package com.example.homework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SingInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_singinactivity)

        val btn1 = findViewById<Button>(R.id.btn_1)
        btn1.setOnClickListener{
            val editTextID = findViewById<EditText>(R.id.Password_3)
            val editTextPassword = findViewById<EditText>(R.id.Password_4)

            val useID = editTextID.text.toString()
            val password = editTextPassword.text.toString()

            if (useID.isEmpty() && password.isEmpty()){
                Toast.makeText(this, "아이디와 비밀번호를 입력하세요.", Toast.LENGTH_SHORT).show()
            }
            else {
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            }
        }

        val btn2 = findViewById<Button>(R.id.btn_2)
        btn2.setOnClickListener{
            val intent = Intent(this, SignpActivity::class.java)
            startActivity(intent)
        }


    }

}
