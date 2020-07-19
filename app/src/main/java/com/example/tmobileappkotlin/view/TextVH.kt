package com.example.tmobileappkotlin.view

import android.graphics.Color
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.tmobileappkotlin.model.Card
import kotlinx.android.synthetic.main.text_item_layout.view.*

class TextVH(itemView: View): RecyclerView.ViewHolder(itemView) {

    val tvValue = itemView.tv_text

    fun onBind(card: Card) {
        tvValue.text = card.value
        tvValue.setTextColor(Color.parseColor(card.attributes.text_color))
        tvValue.setTextSize(card.attributes.font.size)
    }
}