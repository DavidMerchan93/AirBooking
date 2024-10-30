package com.davidmerchan.domain.model.baggage.pack.regular

import com.davidmerchan.domain.model.baggage.pack.BoardingTurn
import java.math.BigDecimal

class RegularBasic(
    price: BigDecimal = BigDecimal(40.0)
): Regular(price) {
    override val name: String = "Basic Regular"
    override val boardingTurn: BoardingTurn = BoardingTurn.END
}