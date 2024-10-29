package com.davidmerchan.domain.model.baggage.pack.vclub

import com.davidmerchan.domain.model.baggage.pack.BoardingTurn
import java.math.BigDecimal

class Classic(
    name: String = "Classic v.club",
    price: BigDecimal = BigDecimal(20.0)
): VClub() {
    override val boardingTurn: BoardingTurn = BoardingTurn.SECOND
}