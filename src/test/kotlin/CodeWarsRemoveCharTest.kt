import com.oodrive.hermes.kata.removeChar
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class CodeWarsRemoveCharTest : StringSpec() {

    init {
        "removeChar" {
            removeChar("eloquent") shouldBe "loquen"
        }


    }

}