package com.davidmerchan.domain.model

import java.math.BigDecimal

data class SeatSection(
    val seats: Array<Seat>,
    val price: BigDecimal,
    val seatClass: SeatClass
)
