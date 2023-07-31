package com.example.lab_dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv_num = findViewById<TextView>(R.id.tv_number)
        val btn_dice = findViewById<Button>(R.id.but_roll)

        btn_dice.setOnClickListener{

            val random = Random
            val num = random.nextInt(6)+1

            tv_num.text = num.toString()

            Log.d("MainActivity","num = ${num.toString()}")
        }
    }
}