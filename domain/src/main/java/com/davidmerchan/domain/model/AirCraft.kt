package com.davidmerchan.domain.model

data class AirCraft(
    val name: String,
    val model: String,
    val airLine: AirLine,
    val airSections: Map<Int, SeatSection>
)