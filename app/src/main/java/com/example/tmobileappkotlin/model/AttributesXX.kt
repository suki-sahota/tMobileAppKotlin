package com.example.tmobileappkotlin.model

import com.squareup.moshi.Json

data class AttributesXX( // title attributes
    @Json(name = "font") val font: FontXX,
    @Json(name = "text_color") val text_color: String
)