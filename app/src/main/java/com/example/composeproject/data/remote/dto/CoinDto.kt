package com.example.composeproject.data.remote.dto


import com.example.composeproject.domain.model.Coin
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CoinDto(
    @Json(name = "id")
    val id: String,
    @Json(name = "is_active")
    val isActive: Boolean,
    @Json(name = "is_new")
    val isNew: Boolean,
    @Json(name = "name")
    val name: String,
    @Json(name = "rank")
    val rank: Int,
    @Json(name = "symbol")
    val symbol: String,
    @Json(name = "type")
    val type: String
)

fun CoinDto.toCoin(): Coin {
    return Coin(
        id = id,
        isActive = isActive,
        name = name,
        rank = rank,
        symbol = symbol
    )
}