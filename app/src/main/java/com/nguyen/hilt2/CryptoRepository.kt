package com.nguyen.hilt2

interface CryptoRepository {
    fun getCryptoCurrency(): List<CryptoCurrency>
}
