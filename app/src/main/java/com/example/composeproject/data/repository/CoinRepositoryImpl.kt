package com.example.composeproject.data.repository

import com.example.composeproject.data.remote.CoinPaprikaApi
import com.example.composeproject.data.remote.dto.CoinDetailDto
import com.example.composeproject.data.remote.dto.CoinDto
import com.example.composeproject.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val coinPaprikaApi: CoinPaprikaApi
) : CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return coinPaprikaApi.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return coinPaprikaApi.getCoinById(coinId)
    }
}