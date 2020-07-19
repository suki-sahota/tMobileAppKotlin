package com.example.tmobileappkotlin.view

import android.graphics.Color
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.tmobileappkotlin.model.Card
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.image_item_layout.view.*

class ImageVH(itemView: View): RecyclerView.ViewHolder(itemView) {

    val tvTitle = itemView.tv_image_title
    val tvDescription = itemView.tv_image_description
    val iv = itemView.iv_image

    fun onBind(card: Card) {
        tvTitle.text = card.title.value
        tvTitle.setTextColor(Color.parseColor(card.title.attributes.text_color))
        tvTitle.setTextSize(card.title.attributes.font.size)

        tvDescription.text = card.description.value
        tvDescription.setTextColor(Color.parseColor(card.description.attributes.text_color))
        tvDescription.setTextSize(card.description.attributes.font.size)

        Picasso.get().load(card.image.url).into(iv)
        iv.getLayoutParams().width = card.image.size.width
        iv.getLayoutParams().height = card.image.size.height
    }
}