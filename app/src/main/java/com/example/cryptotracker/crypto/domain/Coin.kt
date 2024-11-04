package com.example.cryptotracker.crypto.domain

data class Coin(
    val id: String,
    val rank: Int,
    val name: String,
    val symbol: String,
    val marketCapUse: Double,
    val priceUsd: Double,
    val changePercent24Hr: Double
)
