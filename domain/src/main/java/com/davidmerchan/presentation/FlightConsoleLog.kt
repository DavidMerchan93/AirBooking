package com.davidmerchan.presentation

import com.davidmerchan.domain.model.Flight
import com.davidmerchan.domain.utils.Formatter

class FlightConsoleLog: Formatter<Flight> {
    override fun format(item: Flight): String {
        val departure = item.departureArrivalBooking.first
        val arrival = item.departureArrivalBooking.second

        return with(item) {
            """
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
}