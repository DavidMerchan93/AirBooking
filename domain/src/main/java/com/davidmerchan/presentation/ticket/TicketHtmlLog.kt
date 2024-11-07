package com.davidmerchan.presentation.ticket

import com.davidmerchan.domain.model.Ticket
import com.davidmerchan.domain.utils.Formatter

class TicketHtmlLog: Formatter<Ticket> {
    override fun format(item: Ticket): String {
        return "<div>Ticket: ${item.seat}</div>"
    }
}