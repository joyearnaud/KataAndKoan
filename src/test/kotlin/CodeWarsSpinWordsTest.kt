import com.oodrive.hermes.kata.spinWords
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class CodeWarsSpinWordsTest : StringSpec() {

    init {
        "test1" {
            spinWords("Welcome") shouldBe "emocleW"
        }
        "test2" {
            spinWords("Hey fellow warriors") shouldBe "Hey wollef sroirraw"
        }
    }
}