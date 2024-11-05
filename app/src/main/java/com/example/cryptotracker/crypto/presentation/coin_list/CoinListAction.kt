package com.example.cryptotracker.crypto.presentation.coin_list

import com.example.cryptotracker.crypto.presentation.model.CoinUi

sealed interface CoinListAction {
    data class OnCoinClick(val coin: CoinUi): CoinListAction
    data object OnRefresh: CoinListAction
}