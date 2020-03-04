package com.oodrive.hermes.kata

import java.io.File
import kotlinx.coroutines.async
import kotlinx.coroutines.delay

//Part One: Weather Data

//In weather.dat you’ll find daily weather data for Morristown,
// NJ for June 2002. Download this text file, then write a program
// to output the day number (column one) with the smallest
// temperature spread (the maximum temperature is the second column,
// the minimum the third column).

suspend fun getHottestDay(): List<String> {

    val useLines: List<String> =
        File("src/main/resources/weather.dat").useLines { it -> it.filter { it.isNotEmpty() }.toList() }
    delay(1)
    return useLines
}
