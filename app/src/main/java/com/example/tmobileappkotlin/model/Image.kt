package com.example.tmobileappkotlin.model

import com.squareup.moshi.Json

data class Image(
    @Json(name = "size") val size: Size,
    @Json(name = "url") val url: String
)