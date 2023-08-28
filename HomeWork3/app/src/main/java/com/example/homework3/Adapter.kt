package com.example.homework3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homework3.databinding.ListBinding

class Adapter (val Item:MutableList<Data>) : RecyclerView.Adapter<Adapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = ListBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return Holder(binding)
    }
    override fun onBindViewHolder(holder: Holder, position: Int) {
       holder.ImageView.setImageResource(Item[position].Icon)
        holder.name.text = Item[position].Name
        holder.Position.text = Item[position].Position
    }
    override fun getItemCount(): Int {
        return Item.size
    }

    inner class Holder( val binding: ListBinding) : RecyclerView.ViewHolder(binding.root){
        val ImageView = binding.iconItem
        val name = binding.textItem1
        val Position = binding.textItem2
    }
}
