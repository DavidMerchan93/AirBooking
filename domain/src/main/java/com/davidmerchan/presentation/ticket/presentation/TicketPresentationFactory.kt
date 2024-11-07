package com.davidmerchan.presentation.ticket.presentation

import com.davidmerchan.domain.model.Ticket
import com.davidmerchan.domain.utils.Formatter
import com.davidmerchan.presentation.FormatPresentationFactory
import com.davidmerchan.presentation.PresentationType
import com.davidmerchan.presentation.ticket.TicketConsoleLog
import com.davidmerchan.presentation.ticket.TicketHtmlLog

class TicketPresentationFactory: FormatPresentationFactory<Ticket> {
    override fun createPresentation(type: PresentationType): Formatter<Ticket> {
        return when(type) {
            PresentationType.HTML_LOG -> TicketHtmlLog()
            PresentationType.CONSOLE -> TicketConsoleLog()
            else -> throw IllegalArgumentException("Invalid presentation type")
        }
    }
}