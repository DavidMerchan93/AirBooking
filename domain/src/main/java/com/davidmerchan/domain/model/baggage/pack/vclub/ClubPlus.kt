package com.davidmerchan.domain.model.baggage.pack.vclub

import com.davidmerchan.domain.model.baggage.pack.BoardingTurn
import java.math.BigDecimal

class ClubPlus(
    price: BigDecimal = BigDecimal(10.0)
): VClub(price) {
    override val name: String = "Plus v.club"
    override val boardingTurn: BoardingTurn = BoardingTurn.FIRST
}