package com.davidmerchan.domain.model.baggage.pack.regular

import com.davidmerchan.domain.model.baggage.pack.BoardingTurn
import java.math.BigDecimal

class Plus(
    name: String = "Plus Regular",
    price: BigDecimal = BigDecimal(15.00)
): Regular(name, price) {
    override val boardingTurn: BoardingTurn = BoardingTurn.SECOND
}