package com.davidmerchan.domain.model.baggage.pack.vclub

import com.davidmerchan.domain.model.baggage.pack.BaggagePack
import com.davidmerchan.domain.model.baggage.type.BaggageType
import com.davidmerchan.domain.model.baggage.type.BoxPacked
import java.math.BigDecimal

open class VClub(
    override val name: String = "VClub",
    final override var price: BigDecimal = BigDecimal(12.0)
): BaggagePack(name, price) {
    init {
        price -= (price * BigDecimal(0.3))
    }

    override val baggageTypes: List<BaggageType>
        get() = super.baggageTypes + listOf(BoxPacked())
}