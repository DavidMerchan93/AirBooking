package com.davidmerchan.presentation.fight.presentation

import com.davidmerchan.domain.model.Flight
import com.davidmerchan.domain.utils.Formatter
import com.davidmerchan.presentation.FormatPresentationFactory
import com.davidmerchan.presentation.PresentationType
import com.davidmerchan.presentation.fight.FlightConsoleLog
import com.davidmerchan.presentation.fight.FlightHtmlLog

class FlightPresentationFactory: FormatPresentationFactory<Flight> {

    override fun createPresentation(type: PresentationType): Formatter<Flight> {
        return when(type) {
            PresentationType.CONSOLE -> FlightConsoleLog()
            PresentationType.HTML_LOG -> FlightHtmlLog()
            else -> {
                throw IllegalArgumentException("Unsupported presentation type: $type")
            }
        }
    }

}