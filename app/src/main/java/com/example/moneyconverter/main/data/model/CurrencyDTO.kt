package com.example.moneyconverter.main.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CurrencyDTO(

    @SerialName("USD_out")
    val USD_out: String,

    @SerialName("EUR_out")
    val EUR_out: String,

    @SerialName("RUB_out")
    val RUB_out: String
)
