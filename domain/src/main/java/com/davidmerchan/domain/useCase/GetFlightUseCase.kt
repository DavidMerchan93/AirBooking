package com.davidmerchan.domain.useCase

import com.davidmerchan.domain.model.AirCraft
import com.davidmerchan.domain.model.AirLine
import com.davidmerchan.domain.model.Airport
import com.davidmerchan.domain.model.AirportBooking
import com.davidmerchan.domain.model.Flight
import com.davidmerchan.domain.utils.Formatter
import java.math.BigDecimal
import java.time.LocalDateTime

class GetFlightUseCase(
    private val formatter: Formatter<Flight>
) {

    operator fun invoke(): String {
        val flight = getFlight()
        return formatter.format(flight)
    }

    private fun getFlight(): Flight {
        return Flight(
            flightNumber = "Flight 123",
            airCraft = AirCraft(
                "Airbus A320",
                model = "Aircraft A320",
                airLine = AirLine(code = "AV", name = "Avianca", logoUrl = "")
            ),
            price = BigDecimal(1000.00),
            departureArrivalBooking = Pair(
                AirportBooking(
                    Airport(code = "CO", name = "El Dorado", city = "Bogota"),
                    LocalDateTime.now()
                ),
                AirportBooking(
                    Airport(code = "MX", name = "Benito Suarez", city = "Mexico"),
                    LocalDateTime.now().plusHours(2)
                )
            )
        )
    }

}