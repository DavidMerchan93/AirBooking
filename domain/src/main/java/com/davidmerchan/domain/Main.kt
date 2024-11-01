package com.davidmerchan.domain

import com.davidmerchan.domain.useCase.GetFlightUseCase
import com.davidmerchan.domain.useCase.GetTicketUseCase
import com.davidmerchan.presentation.FlightConsoleLog
import com.davidmerchan.presentation.TicketConsoleLog

fun main() {
    val getFlightUseCase = GetFlightUseCase(FlightConsoleLog())
    val flightFormat = getFlightUseCase()
    println("flightFormat: $flightFormat")

    val getTicketUseCase = GetTicketUseCase(TicketConsoleLog())
    val ticketFormat = getTicketUseCase()
    println("ticketFormat: $ticketFormat")
}
