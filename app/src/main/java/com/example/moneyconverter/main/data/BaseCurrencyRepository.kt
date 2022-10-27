package com.example.moneyconverter.main.data

import com.example.moneyconverter.main.domain.model.Currency
import com.example.moneyconverter.main.domain.repository.CurrencyRepository

class BaseCurrencyRepository() : CurrencyRepository {
    override suspend fun updateCurrencies(): List<Currency> {
        TODO("Not yet implemented")
    }
}