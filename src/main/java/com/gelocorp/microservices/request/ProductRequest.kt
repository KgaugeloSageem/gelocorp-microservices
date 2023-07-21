package com.gelocorp.microservices.request

data class ProductRequest(
    private var name: String,
    val quantity: Long,
    val unitPrice: Double
)