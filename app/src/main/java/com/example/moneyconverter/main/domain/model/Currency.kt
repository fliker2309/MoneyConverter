package com.example.moneyconverter.main.domain.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "currencies")
data class Currency(
    @PrimaryKey
    @ColumnInfo(name = "country")
    val country: String,
    @ColumnInfo(name = "value")
    val value: Double
)