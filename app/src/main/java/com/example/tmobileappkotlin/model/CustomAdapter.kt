package com.example.tmobileappkotlin.model

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tmobileappkotlin.R
import com.example.tmobileappkotlin.view.DescriptionVH
import com.example.tmobileappkotlin.view.ImageVH
import com.example.tmobileappkotlin.view.TextVH

class CustomAdapter(): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

//    private val TAG = CustomAdapter::class.java.simpleName // "CustomAdapter"

    var dataSet: MutableList<CardParent> = mutableListOf()
        set(value) { // Replaces whole dataSet with value
            field = value
            notifyDataSetChanged()
        }

    override fun getItemViewType(position: Int): Int {
        super.getItemViewType(position)
        return when(dataSet[position].card_type) {
            "text" -> 0
            "title_description" -> 1
            "image_title_description" -> 2
            else -> { throw Exception("Incorrect View Type") }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when(viewType) {
            0 -> {
                TextVH(LayoutInflater.from(parent.context)
                    .inflate(R.layout.text_item_layout, parent, false))
            }
            1 -> {
                DescriptionVH(LayoutInflater.from(parent.context)
                    .inflate(R.layout.description_item_layout, parent, false))
            }
            2 -> {
                ImageVH(LayoutInflater.from(parent.context)
                    .inflate(R.layout.image_item_layout, parent, false))
            }
            else -> { throw Exception("Incorrect View Type") }
        }
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {
            is TextVH -> { // "is" actually changes holder & narrows it down to TextVH class
                holder.onBind(dataSet[position].card)
            }
            is DescriptionVH -> {
                holder.onBind(dataSet[position].card)
            }
            is ImageVH -> {
                holder.onBind(dataSet[position].card)
            }
        }
    }
}