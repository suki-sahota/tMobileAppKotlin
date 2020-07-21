package com.example.tmobileappkotlin.model

import com.squareup.moshi.Json

data class Description(
    @Json(name = "attributes") val attributes: Attributes,
    @Json(name = "value") val value: String
)