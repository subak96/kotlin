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
import org.w3c.dom.Text

class SingInActivity : AppCompatActivity() {
    private lateinit var resultLauncher: ActivityResultLauncher<Intent>
    private lateinit var btn_2: Button
    private lateinit var textID: TextView
    private lateinit var textpassword: TextView
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_singinactivity)

        val btn1 = findViewById<Button>(R.id.btn_1)
        btn1.setOnClickListener {
            val editTextID = findViewById<EditText>(R.id.Password_3)
            val editTextPassword = findViewById<EditText>(R.id.Password_4)

            val useID = editTextID.text.toString()
            val password = editTextPassword.text.toString()

            if (useID.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "아이디와 비밀번호를 입력하세요.", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, HomeActivity::class.java)
                intent.putExtra("userID", useID)
                startActivity(intent)
            }
        }
        val btn2 = findViewById<Button>(R.id.btn_2)
        btn2.setOnClickListener {
            val intent = Intent(this, SignpActivity::class.java)
            startActivity(intent)
        }

        btn_2 = findViewById<Button>(R.id.btn_2)
        textID = findViewById<EditText>(R.id.Password_3)
        textpassword = findViewById<EditText>(R.id.Password_4)
        setResult()

        btn_2.setOnClickListener {
            val intent = Intent(this, SignpActivity::class.java)
            resultLauncher.launch(intent)
        }


    }
    private fun setResult() {
        resultLauncher = registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()
        ) { result ->
            if (result.resultCode == RESULT_OK) {
                val ID = result.data?.getStringExtra("ID") ?: ""
                val password = result.data?.getStringExtra("password") ?: ""

                textID.text = "$ID"
                textpassword.text = "$password"

            }
        }
        btn_2.setOnClickListener {
            val intent = Intent(this, SignpActivity::class.java)
            resultLauncher.launch(intent)
        }
    }
}