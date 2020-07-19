package com.example.tmobileappkotlin.model

import com.squareup.moshi.Json

data class Size(
    @Json(name = "height") val height: Int,
    @Json(name = "width") val width: Int
)