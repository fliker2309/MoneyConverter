package com.example.moneyconverter.main.domain.usecase

import com.example.moneyconverter.main.domain.model.Currency
import com.example.moneyconverter.main.domain.repository.CurrencyRepository

interface CurrencyInteractor {
    suspend fun currenciesUpdate(): List<Currency>

    class Base(
        private val repository: CurrencyRepository
    ) : CurrencyInteractor {
        override suspend fun currenciesUpdate() = repository.updateCurrencies()
    }
}

