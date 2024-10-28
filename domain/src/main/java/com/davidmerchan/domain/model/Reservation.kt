package com.davidmerchan.domain.model

import java.math.BigDecimal
import java.time.LocalDate

data class Reservation(
    val code: String,
    val departureTickets: List<Ticket>,
    val returnTickets: List<Ticket>,
    val totalPrice: BigDecimal,
    val bookingDate: LocalDate
)