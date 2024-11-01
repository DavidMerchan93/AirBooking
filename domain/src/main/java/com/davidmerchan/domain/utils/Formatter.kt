package com.davidmerchan.domain.utils

import android.text.SpannedString

interface Formatter<T> {
    fun format(item: T): String
    fun format(items: List<T>): String {
        val log = StringBuilder()
        items.forEach {
            log.append(format(it))
        }
        return log.toString()
    }
}