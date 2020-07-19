package com.example.tmobileappkotlin.model

import com.squareup.moshi.Json

data class AttributesX( // description attributes
    @Json(name = "font") val font: FontX,
    @Json(name = "text_color") val text_color: String
)