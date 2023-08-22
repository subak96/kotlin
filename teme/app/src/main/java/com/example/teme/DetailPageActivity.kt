package com.example.teme

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DetailPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detailpage_main)

        val btn1 = findViewById<Button>(R.id.button_1)
        btn1.setOnClickListener {
            val intent = Intent(this, mypageActivity::class.java)
            startActivity(intent)
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU){
            intent?.getSerializableExtra("data", TeamMember::class.java)
        }else{
            intent?.getSerializableExtra("data") as TeamMember
        }
    }

}