package com.davidmerchan.domain.model.baggage.pack.regular

import com.davidmerchan.domain.model.baggage.pack.BaggagePack
import java.math.BigDecimal

abstract class Regular(
    override var price: BigDecimal
) : BaggagePack() {
    abstract override val name: String
}
