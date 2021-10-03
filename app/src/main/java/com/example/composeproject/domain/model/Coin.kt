package com.example.composeproject.domain.model

import com.squareup.moshi.Json

data class Coin(
    val id: String,
    val isActive: Boolean,
    @Json(name = "name")
    val name: String,
    @Json(name = "rank")
    val rank: Int,
    @Json(name = "symbol")
    val symbol: String
)
