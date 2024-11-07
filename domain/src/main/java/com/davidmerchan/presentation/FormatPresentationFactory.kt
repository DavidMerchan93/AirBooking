package com.davidmerchan.presentation

import com.davidmerchan.domain.utils.Formatter

interface FormatPresentationFactory <T> {
    fun createPresentation(type: PresentationType): Formatter<T>
}