package com.davidmerchan.domain.model.baggage.pack.regular

import com.davidmerchan.domain.model.baggage.pack.BoardingTurn
import java.math.BigDecimal

class Basic(
    name: String = "Basic Regular",
    price: BigDecimal = BigDecimal(40.0)
): Regular(name, price) {
    override val boardingTurn: BoardingTurn = BoardingTurn.END
}