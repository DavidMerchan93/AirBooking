package com.davidmerchan.domain.model.baggage.pack

enum class BoardingTurn(val message: String) {
    FIRST("Primero en abordar"),
    SECOND("Segund en abordar"),
    THIRD("Tercero en abordar"),
    END("Ultimo en abordar"),
}