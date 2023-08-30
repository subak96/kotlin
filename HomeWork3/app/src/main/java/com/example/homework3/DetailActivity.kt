package com.example.homework3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.homework3.databinding.ActivityDetailBinding
import java.text.DecimalFormat

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // MainActivity에서 인텐트로 넘어온 데이터 받기
        val imageId = intent.getIntExtra("ImageView", 0)
        val itemTitle = intent.getStringExtra("itemTitle")
        val nickName = intent.getStringExtra("nickName")
        val price = intent.getIntExtra("price", 0)
        val detail = intent.getStringExtra("detail")
        val address = intent.getStringExtra("address")

        // 받아온 데이터를 UI에 표시
        binding.imageView.setImageResource(imageId)
        binding.tite.text = itemTitle
        binding.nickname.text = nickName
        binding.price.text = DecimalFormat("#,###").format(price)+"원"
        binding.diteil.text = detail
        binding.address.text = "${address}"

        val back = findViewById<ImageView>(R.id.back)
        back.setOnClickListener {
            finish()
        }


    }
}