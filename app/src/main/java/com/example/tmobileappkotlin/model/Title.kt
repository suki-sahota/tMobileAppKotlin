package com.example.tmobileappkotlin.model

import com.squareup.moshi.Json

data class Title(
    @Json(name = "attributes") val attributes: AttributesXX,
    @Json(name = "value") val value: String
)