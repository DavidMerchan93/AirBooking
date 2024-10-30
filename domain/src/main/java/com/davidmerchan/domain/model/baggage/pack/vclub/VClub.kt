package com.davidmerchan.domain.model.baggage.pack.vclub

import com.davidmerchan.domain.model.baggage.pack.BaggagePack
import com.davidmerchan.domain.model.baggage.type.BaggageType
import com.davidmerchan.domain.model.baggage.type.BoxPacked
import java.math.BigDecimal

abstract class VClub(
    final override var price: BigDecimal = BigDecimal(12.0)
): BaggagePack() {

    init {
        price -= (price * BigDecimal(0.3))
    }

    abstract override val name: String

    override val baggageTypes: List<BaggageType>
        get() = super.baggageTypes + listOf(BoxPacked())
}