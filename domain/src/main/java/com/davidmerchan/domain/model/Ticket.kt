package com.davidmerchan.domain.model

import com.davidmerchan.domain.model.baggage.pack.BaggagePack
import com.davidmerchan.domain.model.seat.Seat
import com.davidmerchan.domain.utils.Formatter

data class Ticket(
    val flight: Flight,
    val passenger: Passenger,
    val baggagePackage: BaggagePack,
    val seat: Seat
)
