package com.davidmerchan.domain.model.baggage.pack.regular

import com.davidmerchan.domain.model.baggage.pack.BoardingTurn
import java.math.BigDecimal

class RegularPlus(
    price: BigDecimal = BigDecimal(15.00)
): Regular(price) {
    override val name: String = "Plus Regular"
    override val boardingTurn: BoardingTurn = BoardingTurn.SECOND
}