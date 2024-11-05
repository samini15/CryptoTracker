package com.example.cryptotracker.core.data.networking

import com.example.cryptotracker.BuildConfig

fun constructUrl(url: String): String {
    return when {
        url.contains(BuildConfig.BASE_URL) -> url
        url.startsWith("/") -> BuildConfig.BASE_URL + url.drop(1) // Drop the slash
        else -> BuildConfig.BASE_URL + url
    }
}