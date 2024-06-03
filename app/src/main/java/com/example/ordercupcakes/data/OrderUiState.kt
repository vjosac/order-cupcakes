package com.example.ordercupcakes.data

data class OrderUiState(
    val quantity: Int = 0,
    val flavor: String = "",
    val date: String = "",
    val price: String = "",
    val pickupOption: List<String> = listOf()
)
