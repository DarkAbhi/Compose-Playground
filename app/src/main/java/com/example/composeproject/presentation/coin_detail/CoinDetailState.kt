package com.example.composeproject.presentation.coin_detail

import com.example.composeproject.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)