package com.example.moneyconverter.main.data.network

import retrofit2.http.GET

interface CurrenciesService {
    @GET("api/kursExchange")
    suspend fun currencies(): List<CurrencyDTO>
}