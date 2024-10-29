package com.davidmerchan.domain.model.baggage.pack.regular

import com.davidmerchan.domain.model.baggage.pack.BoardingTurn
import java.math.BigDecimal

class Classic(
    name: String = "Classic Regular",
    price: BigDecimal = BigDecimal(25.0)
): Regular(name, price) {
    override val boardingTurn: BoardingTurn = BoardingTurn.THIRD
}