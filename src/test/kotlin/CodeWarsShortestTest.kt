import arrow.core.Some
import com.oodrive.hermes.kata.findShort
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class CodeWarsShortestTest : StringSpec() {

    init {
        "findNullableShort" {
            //findShort(null) shouldBe None
        }

        "findEmptyShort" {
            findShort("") shouldBe Some(0)
        }

        "findShort" {
            findShort("bitcoin take over the world maybe who knows perhaps") shouldBe Some(3)
        }
        "findShort2" {
            findShort("turns out random test cases are easier than writing out basic ones") shouldBe Some(3)
        }


    }

}