package com.davidmerchan.domain.model.baggage.pack.vclub

import com.davidmerchan.domain.model.baggage.pack.BoardingTurn
import java.math.BigDecimal

class Plus(
    name: String = "Plus v.club",
    price: BigDecimal = BigDecimal(10.0)
): VClub() {
    override val boardingTurn: BoardingTurn = BoardingTurn.FIRST
}