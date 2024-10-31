package com.davidmerchan.domain

import com.davidmerchan.domain.model.AirCraft
import com.davidmerchan.domain.model.AirLine
import com.davidmerchan.domain.model.Airport
import com.davidmerchan.domain.model.AirportBooking
import com.davidmerchan.domain.model.Flight
import com.davidmerchan.domain.model.Passenger
import com.davidmerchan.domain.model.Ticket
import com.davidmerchan.domain.model.baggage.pack.regular.RegularBasic
import com.davidmerchan.domain.model.seat.Seat
import com.davidmerchan.domain.model.seat.SeatClass
import com.davidmerchan.domain.model.seat.SeatStatus
import java.math.BigDecimal
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.Month

fun main() {
    val flight = Flight(
        flightNumber = "Y4 708",
        airCraft = AirCraft("Airbus", "A320", AirLine("AV22","Avianca","avianca.png")),
        price = BigDecimal(100.0),
        departureArrivalBooking = getAirportPair()
    )
    val flightFormatted = flight.format()
    println(flightFormatted)

    val ticket = Ticket(
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
        baggagePackage = RegularBasic(BigDecimal(50)),
        seat = Seat(
            colum = 10,
            row = "A",
            price = BigDecimal(100.0),
            seatClass = SeatClass.ECONOMY,
            status = SeatStatus.AVAILABLE
        )
    )

    val ticketFormatted = ticket.format()
    println(ticketFormatted)
}

fun getAirportPair(): Pair<AirportBooking, AirportBooking> {
    return Pair(
        first = AirportBooking(
            airport = Airport("BOG", "Bogotá", "Bogota"),
            dateTime = LocalDateTime.of(
                2023, Month.JANUARY, 10, 13, 0, 0
            )
        ),
        second = AirportBooking(
            airport = Airport("CUN", "Cancún", "Cancun"),
            dateTime = LocalDateTime.of(
                2023, Month.JANUARY, 10, 17, 30, 0
            )
        )
    )
}