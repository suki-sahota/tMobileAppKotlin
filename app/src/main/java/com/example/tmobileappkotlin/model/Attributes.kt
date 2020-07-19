package com.example.tmobileappkotlin.model

import com.squareup.moshi.Json

data class Attributes( // text attributes
    @Json(name = "font") val font: Font,
    @Json(name = "text_color") val text_color: String
)