package com.example.moneyconverter.main.domain.model

data class Currency(
    private val country: String,
    private val value: Double
) {
    interface Mapper<T> {
        fun map(country: String, value: Double): T
    }

    fun <T> map(mapper: Mapper<T>): T = mapper.map(country, value)
}
