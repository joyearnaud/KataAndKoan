import com.oodrive.hermes.kata.highAndLow
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class CodeWarsDeleteNthTest : StringSpec() {

    init {
        "testFixed" {
            highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4") shouldBe "42 -9"
        }
    }
}