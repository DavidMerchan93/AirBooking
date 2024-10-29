package com.davidmerchan.domain.model.baggage.pack.regular

import com.davidmerchan.domain.model.baggage.pack.BaggagePack
import java.math.BigDecimal

open class Regular(
    override val name: String,
    override var price: BigDecimal
) : BaggagePack(name, price)
