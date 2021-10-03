package com.example.composeproject.domain.repository

import com.example.composeproject.data.remote.dto.CoinDetailDto
import com.example.composeproject.data.remote.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>
    suspend fun getCoinById(coinId: String): CoinDetailDto
}