package com.example.tmobileappkotlin.model

import com.squareup.moshi.Json

data class Page(
    @Json(name = "cards") val cards: MutableList<CardY>
)