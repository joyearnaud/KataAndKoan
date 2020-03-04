import arrow.core.Some
import com.oodrive.hermes.kata.decodeMorse
import com.oodrive.hermes.kata.duplicateCount
import com.oodrive.hermes.kata.findShort
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class CodeWarsMorseTest : StringSpec() {

    init {
        "first case" {
            decodeMorse(".... . -.--   .--- ..- -.. .") shouldBe "HEY JUDE"
        }

        "case E" {
            decodeMorse(" . ") shouldBe "E"
        }
    }

}