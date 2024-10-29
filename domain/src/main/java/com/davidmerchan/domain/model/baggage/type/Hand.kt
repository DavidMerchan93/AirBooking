package com.davidmerchan.domain.model.baggage.type

class Hand: BaggageType() {
    override val emoji: String = "\uD83D\uDC5C"
    override val title: String = "Hand baggage"
    val warning = "Simple warning"
}