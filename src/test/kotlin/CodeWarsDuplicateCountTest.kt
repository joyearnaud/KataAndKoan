import arrow.core.Some
import com.oodrive.hermes.kata.duplicateCount
import com.oodrive.hermes.kata.findShort
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class CodeWarsDuplicateCountTest : StringSpec() {

    init {
        "abcde returns zero" {
            duplicateCount("abcde") shouldBe 0
        }

        "abcdea returns one" {
            duplicateCount("abcdea") shouldBe 1
        }

        "indivisibility returns one" {
            duplicateCount("indivisibility") shouldBe 1
        }

        "really long string containing duplicates returns three" {
            val text = "dA" + "c".repeat(10) + "b".repeat(100) + "a".repeat(1000)
            duplicateCount(text) shouldBe 3
        }


    }

}