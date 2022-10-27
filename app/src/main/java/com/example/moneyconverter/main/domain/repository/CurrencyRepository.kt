package com.example.moneyconverter.main.domain.repository

import com.example.moneyconverter.main.domain.model.Currency

interface CurrencyRepository {

    suspend fun updateCurrencies(): List<Currency>
}
