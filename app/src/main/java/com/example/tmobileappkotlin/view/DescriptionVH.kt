package com.example.tmobileappkotlin.view

import android.graphics.Color
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.tmobileappkotlin.model.Card
import kotlinx.android.synthetic.main.description_item_layout.view.*

class DescriptionVH(itemView: View): RecyclerView.ViewHolder(itemView) {

    val tvTitle = itemView.tv_description_title
    val tvDescription = itemView.tv_description_description

    fun onBind(card: Card) {
        tvTitle.text = card.title.value
        tvTitle.setTextColor(Color.parseColor(card.title.attributes.text_color))
        tvTitle.setTextSize(card.title.attributes.font.size)

        tvDescription.text = card.description.value
        tvDescription.setTextColor(Color.parseColor(card.description.attributes.text_color))
        tvDescription.setTextSize(card.description.attributes.font.size)
    }
}