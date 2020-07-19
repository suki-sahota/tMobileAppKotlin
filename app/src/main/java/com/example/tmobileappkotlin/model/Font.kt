package com.example.tmobileappkotlin.model

import com.squareup.moshi.Json

data class Font( // text font
    @Json(name = "size") val size: Float
)