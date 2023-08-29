package com.example.homework3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homework3.databinding.ListBinding
import java.text.DecimalFormat

class Adapter (val Item:MutableList<Date>) : RecyclerView.Adapter<Adapter.Holder>() {

    interface ItemClick {
        fun onClick(view : View, position : Int)
    }

    var itemClick : ItemClick? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = ListBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return Holder(binding)
    }
    override fun onBindViewHolder(holder: Holder, position: Int) {
       holder.ImageView.setImageResource(Item[position].ImageView)
        holder.Tite.text = Item[position].itemTite
        holder.Position.text = Item[position].c

        val price = Item[position].price
        holder.price.text = DecimalFormat("#,###").format(price)+"원"
        holder.heart.text = Item[position].Heart.toString()
        holder.chat.text = Item[position].Chat.toString()

    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }
    override fun getItemCount(): Int {
        return Item.size
    }

    inner class Holder( val binding: ListBinding) : RecyclerView.ViewHolder(binding.root){
        val ImageView = binding.iconItem
        val Tite = binding.textItem1
        val Position = binding.textItem2
        val price = binding.textItem3
        val heart = binding.heart
        val chat = binding.chat
    }
}
