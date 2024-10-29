package com.davidmerchan.domain.model.baggage.type

class Checked: BaggageType() {
    override val emoji: String = "\uD83E\uDDF3"
    override val title: String = "Checked"
    override val quantity: Int = 3
}