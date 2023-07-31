package com.example.helloworld

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onButton1Clicked(v: View) {
        val myIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"))
        startActivity(myIntent)
    }

    fun onButton2Clicked(v: View) {
        val myIntent = Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-1234-5678"))
        startActivity(myIntent)
    }
}