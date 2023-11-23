package com.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.recyclerview.databinding.ActivityMainBinding
import com.recyclerview.databinding.ItemMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val date = mutableListOf<String>()
        for (i in 1..10)
            date.add(("item $i"))
        val adapter = Adapter(date)
        binding.recycler.adapter = adapter
        binding.recycler.layoutManager = LinearLayoutManager(this)

    }


    //각 항목에 해당하는 뷰객체를 가지는 뷰 홀더
    class ViewHolder(val binding: ItemMainBinding) : RecyclerView.ViewHolder(binding.root)

    //뷰 홀더의 뷰에 데이터를 출력해 각 항목을 만들어주는 역할
    class Adapter(private val date: List<String>) :
        RecyclerView.Adapter<ViewHolder>() {
        //항목 개수를 판단
        override fun getItemCount(): Int {
            return date.size
        }

        //항목을 구성할 때 이용할 뷰 홀더 객체 준비
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder
        {
            val itemBinding = ItemMainBinding.inflate(LayoutInflater.from(parent.context),parent,false)
            return ViewHolder(itemBinding)
        }

        //매개변수로 전달된 뷰 홀더 객체의 뷰에 데이터를 출력하거나 필요한 이벤트 등록
        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val item = date[position]
            holder.binding.itemDate.text = item
        }
    }
}