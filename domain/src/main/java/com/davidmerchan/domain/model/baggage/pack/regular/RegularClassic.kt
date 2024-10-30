package com.davidmerchan.domain.model.baggage.pack.regular

import com.davidmerchan.domain.model.baggage.pack.BoardingTurn
import java.math.BigDecimal

class RegularClassic(
    price: BigDecimal = BigDecimal(25.0)
): Regular(price) {
    override val name: String = "Classic Regular"
    override val boardingTurn: BoardingTurn = BoardingTurn.THIRD
}