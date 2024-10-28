package com.davidmerchan.domain.model

import java.time.LocalDate

data class Passenger(
    val name: String,
    val lastName: String,
    val email: String,
    val phoneNumber: String,
    val nationality: String,
    val documentNumber: String,
    val documentType: String,
    val birthDate: LocalDate,
)