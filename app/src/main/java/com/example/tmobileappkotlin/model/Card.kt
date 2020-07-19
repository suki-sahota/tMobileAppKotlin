package com.example.tmobileappkotlin.model

import com.squareup.moshi.Json

data class Card(
    @Json(name = "attributes") val attributes: Attributes, // text only
    @Json(name = "description") val description: Description, // title_description & image_title_description
    @Json(name = "image") val image: Image, // image_title_description
    @Json(name = "title") val title: Title, // title_description  & image_title_description
    @Json(name = "value") val value: String // text only
)