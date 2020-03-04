package com.oodrive.hermes.kata

import arrow.core.*

fun removeChar(str: String): String = str.dropLast(1).drop(1)

fun twoOldestAges(ages: List<Int>): List<Int> = ages.sorted().drop(ages.size - 2).distinctBy { }

tailrec fun getMiddle(word: String): String = if (word.length <= 2) word else getMiddle(word.dropLast(1).drop(1))

fun highAndLow(numbers: String): String = numbers.split(" ").map(String::toInt).let { "${it.max()} ${it.min()}" }

fun spinWords(sentence: String): String =
    sentence.split(" ").joinToString(" ") { if (it.length >= 5) it.reversed() else it }

fun extractFileName(dirtyFileName: String): String = dirtyFileName
    .substringAfter("_")
    .substringBeforeLast(".")

typealias Toto = String

fun findShort(s: Toto): Option<Int> = s.split(" ").minByF { it.length }.map { it.length }

fun findShort2(s: String?): Option<Int> = s?.split(" ").minByIntF()

fun List<String>?.minByIntF(): Option<Int> = Option.fromNullable(this?.minBy { it.length }?.length)

fun <T, R : Comparable<R>> Iterable<T>.minByF(selector: (T) -> R): Option<T> = Option.fromNullable(this.minBy(selector))

fun duplicateCount(text: String): Int = text.toLowerCase().groupingBy { it }.eachCount().filter { it.value > 1 }.size

val MorseCode: Map<String, String> = mapOf(
    ".-" to "A",
    "" to "B",
    "" to "C",
    "-.." to "D",
    "." to "E",
    "" to "F",
    "" to "G",
    "...." to "H",
    "" to "I",
    ".---" to "J",
    "" to "K",
    "" to "L",
    "" to "M",
    "" to "O",
    "" to "P",
    "" to "Q",
    "" to "R",
    "" to "S",
    "" to "T",
    "..-" to "U",
    "" to "V",
    ".--" to "W",
    "-.--" to "Y",
    "" to "Z",
    " " to " "
)

fun decodeMorse(code: String): Any  {
    val updated = MorseCode + ("_" to " ")
    return code.trim().replace("   ", " _ ")
        .split( " ")
        .fold("", {acc, s -> "$acc${updated[s]}"})
}
