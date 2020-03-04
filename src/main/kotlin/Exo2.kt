package com.oodrive.hermes.kata

object Exo2 {
    @JvmStatic
    fun String.getLongestCommonSequenceWith(input2: String): String =
            if (this.isEmpty() && input2.isEmpty()) ""
            else createSequences(this, setOf()).intersect(createSequences(input2, setOf())).maxBy { it.length } ?: ""

    /*SOLUTION 1*/

    private tailrec fun createSequences(input: String, set: Set<String>, startingAt: Int = 0): Set<String> =
            if (startingAt > input.length) set
            else {
                val accSet: Set<String> =
                        set + ((startingAt.plus(1))..input.length).map { ind ->
                            startingAt.let { input.substring(it, ind) }
                        }.toSet()
                createSequences(input, accSet, startingAt.plus(1))
            }

    /*SOLUTION 2*/

    @JvmStatic @JvmOverloads
    fun createSequences(s: String, op: (s: String, createSequences: Set<String>)-> Set<String> = ::foldPlus): Set<String> {
        return if (s.isNotEmpty())
            op(s, createSequences(s.drop(1)))
        else
            setOf()
    }

    private fun foldPlus(s: String, seq: Set<String>): Set<String> {
        return seq.plus(s.foldIndexed(setOf<String>(), { i, acc, _ ->
            acc.plus(s.substring(0, i + 1))
        }))
    }
}