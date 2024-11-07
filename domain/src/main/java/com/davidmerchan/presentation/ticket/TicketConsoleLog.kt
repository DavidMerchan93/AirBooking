package com.davidmerchan.presentation.ticket

import com.davidmerchan.domain.model.Ticket
import com.davidmerchan.domain.utils.Formatter

class TicketConsoleLog: Formatter<Ticket> {
    override fun format(item: Ticket): String {
        return """
            |Ticket Number: ${item.flight.flightNumber}
            |Passenger: ${item.passenger.name}
            |Baggage Package: ${item.baggagePackage.name}
            |Seat: ${item.seat.seatClass}
            |Price: $ ${item.flight.price}
        """.trimIndent()
    }
}