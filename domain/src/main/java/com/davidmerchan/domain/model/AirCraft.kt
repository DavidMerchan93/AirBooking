package com.davidmerchan.domain.model

import com.davidmerchan.domain.model.seat.SeatSection

data class AirCraft(
    val name: String,
    val model: String,
    val airLine: AirLine,
    //val airSections: Map<Int, SeatSection>
)