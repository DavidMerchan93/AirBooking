package com.davidmerchan.domain.useCase

import com.davidmerchan.domain.model.AirCraft
import com.davidmerchan.domain.model.AirLine
import com.davidmerchan.domain.model.Airport
import com.davidmerchan.domain.model.AirportBooking
import com.davidmerchan.domain.model.Flight
import com.davidmerchan.domain.model.Passenger
import com.davidmerchan.domain.model.Ticket
import com.davidmerchan.domain.model.baggage.pack.BaggagePack
import com.davidmerchan.domain.model.baggage.pack.regular.RegularPlus
import com.davidmerchan.domain.model.seat.Seat
import com.davidmerchan.domain.model.seat.SeatClass
import com.davidmerchan.domain.model.seat.SeatStatus
import com.davidmerchan.domain.utils.Formatter
import java.math.BigDecimal
import java.time.LocalDate
import java.time.LocalDateTime

class GetTicketUseCase(
    private val formatter: Formatter<Ticket>
) {
    operator fun invoke(): String {
        val ticket = getTicket(getFlight())
        return formatter.format(ticket)
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

    private fun getTicket(flight: Flight): Ticket {
        return Ticket(
            flight = flight,
            passenger = Passenger(
                name = "David",
                lastName = "Merchan",
                email = "david@gmail.com",
                phoneNumber = "55554444",
                nationality = "USA",
                documentNumber = "123456789",
                documentType = "Passport",
                birthDate = LocalDate.of(1990, 1, 1)
            ),
            baggagePackage = RegularPlus(),
            seat = Seat(
                colum = 10,
                row = "A",
                price = flight.price,
                seatClass = SeatClass.PLUS,
                status = SeatStatus.AVAILABLE
            )
        )
    }
}