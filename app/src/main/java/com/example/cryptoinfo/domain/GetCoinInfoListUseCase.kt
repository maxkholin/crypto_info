package com.example.cryptoinfo.domain

import androidx.lifecycle.LiveData

class GetCoinInfoListUseCase(
    private val repository: CoinRepository
) {

    operator fun invoke(): LiveData<List<CoinInfo>> {
        return repository.getCoinInfoList()
    }
}