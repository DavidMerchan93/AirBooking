package com.davidmerchan.domain.model

import com.davidmerchan.domain.utils.Formatter
import java.math.BigDecimal
import java.time.Duration

data class Flight(
    val flightNumber: String,
    val airCraft: AirCraft,
    val price: BigDecimal,
    val departureArrivalBooking: Pair<AirportBooking, AirportBooking>,
    val duration: Duration = Duration.between(
        departureArrivalBooking.second.dateTime,
        departureArrivalBooking.first.dateTime
    )
)
