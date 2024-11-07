package com.davidmerchan.presentation

import com.davidmerchan.domain.useCase.GetFlightUseCase
import com.davidmerchan.domain.useCase.GetTicketUseCase
import com.davidmerchan.presentation.fight.presentation.FlightPresentationFactory
import com.davidmerchan.presentation.ticket.presentation.TicketPresentationFactory

fun main() {
    val formatType = PresentationType.CONSOLE
    val presentation = FlightPresentationFactory().createPresentation(formatType)
    val getFlightUseCase = GetFlightUseCase(presentation)
    val flightFormat = getFlightUseCase()
    println("flightFormat: $flightFormat")

    val ticketPresentation = TicketPresentationFactory().createPresentation(formatType)
    val getTicketUseCase = GetTicketUseCase(ticketPresentation)
    val ticketFormat = getTicketUseCase()
    println("ticketFormat: $ticketFormat")
}
