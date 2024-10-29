package com.davidmerchan.domain.model.baggage.pack.vclub

import com.davidmerchan.domain.model.baggage.pack.BoardingTurn
import java.math.BigDecimal

class Basic(
    name: String = "Basic v.club",
    price: BigDecimal = BigDecimal(30.0)
): VClub(name, price) {
    override val boardingTurn: BoardingTurn = BoardingTurn.THIRD
}