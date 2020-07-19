package com.example.tmobileappkotlin.model

import com.squareup.moshi.Json

data class CardY( // child of Cards class; parent to Card class
    @Json(name = "card") val card: Card,
    @Json(name = "card_type") val card_type: String
)