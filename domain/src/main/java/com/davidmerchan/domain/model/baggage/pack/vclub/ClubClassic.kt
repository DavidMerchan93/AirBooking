package com.davidmerchan.domain.model.baggage.pack.vclub

import com.davidmerchan.domain.model.baggage.pack.BoardingTurn
import java.math.BigDecimal

class ClubClassic(
    price: BigDecimal = BigDecimal(20.0)
): VClub(price) {
    override val name: String = "Classic v.club"
    override val boardingTurn: BoardingTurn = BoardingTurn.SECOND
}