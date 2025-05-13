package com.example.financetracker.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "transactions")
data class Transaction(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val amount: Double,
    val description: String,
    val category: String,
    val date: Date,
    val type: TransactionType,
    val isRecurring: Boolean = false
)

enum class TransactionType {
    INCOME,
    EXPENSE
} 