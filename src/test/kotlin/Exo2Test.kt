import com.oodrive.hermes.kata.Exo2.createSequences
import com.oodrive.hermes.kata.Exo2.getLongestCommonSequenceWith
import io.kotlintest.matchers.collections.shouldContainAll

import io.kotlintest.specs.StringSpec
import io.kotlintest.shouldBe


class Exo2Test : StringSpec() {

    init {
        "longestCommonSequence void" {
            "".getLongestCommonSequenceWith("") shouldBe ""
        }
        "longestCommonSequence void 2" {
            "".getLongestCommonSequenceWith("a") shouldBe ""
        }
        "longestCommonSequence void 3" {
            "a".getLongestCommonSequenceWith("") shouldBe ""
        }
        "longestCommonSequence simple" {
            "ab".getLongestCommonSequenceWith("ab") shouldBe "ab"
        }
        "longestCommonSequence simple with noise" {
            "abattd".getLongestCommonSequenceWith("gdgeaba") shouldBe "aba"
        }
        "longestCommonSequence simple with noise 2" {
            "abc".getLongestCommonSequenceWith("sdsad") shouldBe "a"
        }
        "longestCommonSequence simple with noise 3" {
            "abcba".getLongestCommonSequenceWith("abcba") shouldBe "abcba"
        }
        "longestCommonSequence simple with noise 4" {
            "thhwerwaaa".getLongestCommonSequenceWith("aaa") shouldBe "aaa"
        }
        "longestCommonSequence simple with noise 5" {
            createSequences("abc") shouldContainAll listOf("c", "b", "bc", "a", "ab", "abc")
        }

    }

}