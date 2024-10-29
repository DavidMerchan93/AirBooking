package com.davidmerchan.domain.model.seat

import java.math.BigDecimal

data class SeatSection(
    val seats: Array<Seat>,
    val price: BigDecimal,
    val seatClass: SeatClass
)
