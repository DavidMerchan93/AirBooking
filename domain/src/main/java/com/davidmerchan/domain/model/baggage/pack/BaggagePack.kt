package com.davidmerchan.domain.model.baggage.pack

import com.davidmerchan.domain.model.baggage.type.BaggageType
import com.davidmerchan.domain.model.baggage.type.BigHand
import com.davidmerchan.domain.model.baggage.type.Checked
import com.davidmerchan.domain.model.baggage.type.Hand
import java.math.BigDecimal

abstract class BaggagePack {
    abstract val name: String
    abstract var price: BigDecimal
    abstract val boardingTurn: BoardingTurn

    open val baggageTypes: List<BaggageType> = listOf(
        Hand(),
        BigHand(),
        Checked()
    )
}