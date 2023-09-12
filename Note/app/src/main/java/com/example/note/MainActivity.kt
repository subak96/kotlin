package com.example.note

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.note.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnSave.setOnClickListener{
            saveData()
            Toast.makeText(this, "Data Saved.", Toast.LENGTH_SHORT).show()
        }
        loadData()
    }

    private fun saveData() {
        val pref = getSharedPreferences("pref",0)
        val edit = pref.edit() // 수정 모드
        // 1번째 인자는 키, 2번째 인자는 실제 담아둘 값
        edit.putString("name", binding.etHello.text.toString())
        edit.apply() // 저장완료
    }

    private fun loadData() {
        val pref = getSharedPreferences("pref",0)
        // 1번째 인자는 키, 2번째 인자는 데이터가 존재하지 않을경우의 값
        binding.etHello.setText(pref.getString("name",""))
    }
}