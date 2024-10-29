package com.davidmerchan.domain.model.seat

import java.math.BigDecimal

data class Seat(
    val colum: Int,
    val row: String,
    val price: BigDecimal,
    val seatClass: SeatClass,
    val status: SeatStatus
)
