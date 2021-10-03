package com.example.composeproject.presentation.coin_list

import com.example.composeproject.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)