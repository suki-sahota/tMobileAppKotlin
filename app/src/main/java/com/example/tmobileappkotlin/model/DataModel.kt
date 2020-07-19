package com.example.tmobileappkotlin.model

import com.squareup.moshi.Json

data class DataModel(
    @Json(name = "page") val page: Page
)