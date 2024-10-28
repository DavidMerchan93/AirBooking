package com.davidmerchan.domain.model

import java.math.BigDecimal

data class BaggagePackage(
    val name: String,
    val price: BigDecimal,
    val personalQuantity: Int,
    val handQuantity: Int,
    val checkedBagQuantity: Int
)