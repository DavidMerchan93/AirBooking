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
): Formatter {
    override fun format(): String {
        val departure = departureArrivalBooking.first
        val arrival = departureArrivalBooking.second

        return """
            |Flight Number: $flightNumber
            |AirCraft: ${airCraft.name}
            |Price: $ $price
            |Duration: $duration
            |Departure-Arrival Booking:
            |    Departure: ${departure.airport.name}
            |    Departure Date: ${departure.dateTime}
            |    Arrival: ${arrival.airport.name}
            |    Arrival Date: ${departureArrivalBooking.first.dateTime}
        """.trimIndent()
    }
}
