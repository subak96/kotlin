package com.homework_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.homework_calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val calculatorViewModel by lazy { ViewModelProvider(this).get(CalculatorViewModel::class.java) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setContentView(binding.root)

        value()

    }

    private fun value() {
        binding.Plus.setOnClickListener {
            val number1 = binding.number1Edit.text.toString().toIntOrNull() ?: 0
            val number2 = binding.number2Edit.text.toString().toIntOrNull() ?: 0

            calculatorViewModel.setInPut(number1 + number2)

            calculatorViewModel._inputlivedate.observe(this) { result ->
                binding.value.text = "값 : $result"
            }

        }
        binding.subtraction.setOnClickListener {
            val number1 = binding.number1Edit.text.toString().toIntOrNull() ?: 0
            val number2 = binding.number2Edit.text.toString().toIntOrNull() ?: 0

            calculatorViewModel.setInPut(number1 - number2)

            calculatorViewModel._inputlivedate.observe(this) { result ->
                binding.value.text = "값 : $result"
            }
        }
        binding.multiplication.setOnClickListener {
            val number1 = binding.number1Edit.text.toString().toIntOrNull() ?: 0
            val number2 = binding.number2Edit.text.toString().toIntOrNull() ?: 0

            calculatorViewModel.setInPut(number1 * number2)

            calculatorViewModel._inputlivedate.observe(this) { result ->
                binding.value.text = "값 : $result"
            }
        }
        binding.division.setOnClickListener {
            val number1 = binding.number1Edit.text.toString().toIntOrNull() ?: 0
            val number2 = binding.number2Edit.text.toString().toIntOrNull() ?: 0

            calculatorViewModel.setInPut(number1 / number2)

            calculatorViewModel._inputlivedate.observe(this) { result ->
                binding.value.text = "값 : $result"
            }
        }
    }
}