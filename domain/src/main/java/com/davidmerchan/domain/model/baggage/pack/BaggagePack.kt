package com.davidmerchan.domain.model.baggage.pack

import com.davidmerchan.domain.model.baggage.type.BaggageType
import com.davidmerchan.domain.model.baggage.type.BigHand
import com.davidmerchan.domain.model.baggage.type.Checked
import com.davidmerchan.domain.model.baggage.type.Hand
import java.math.BigDecimal

open class BaggagePack(
    open val name: String,
    open var price: BigDecimal = BigDecimal(0.0)
) {
    open val boardingTurn: BoardingTurn = BoardingTurn.END
    open val baggageTypes: List<BaggageType> = listOf(
        Hand(),
        BigHand(),
        Checked()
    )
}