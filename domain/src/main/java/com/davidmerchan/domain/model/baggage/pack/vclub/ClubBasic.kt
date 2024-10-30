package com.davidmerchan.domain.model.baggage.pack.vclub

import com.davidmerchan.domain.model.baggage.pack.BoardingTurn
import java.math.BigDecimal

class ClubBasic(
    price: BigDecimal = BigDecimal(30.0)
): VClub(price) {
    override val name: String = "Basic v.club"
    override val boardingTurn: BoardingTurn = BoardingTurn.THIRD
}