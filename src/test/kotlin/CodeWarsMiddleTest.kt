import com.oodrive.hermes.kata.getMiddle
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class CodeWarsEvaporator : StringSpec() {

    init {
        "getMiddle with one letter string" {
            getMiddle("A") shouldBe "A"
        }

        "getMiddle with short pair string" {
            getMiddle("test") shouldBe "es"
        }

        "getMiddle with impair string" {
            getMiddle("testing") shouldBe "t"
        }

        "getMiddle with long pair string" {
            getMiddle("middle") shouldBe "dd"
        }
    }
}