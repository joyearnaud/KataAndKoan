import com.oodrive.hermes.kata.twoOldestAges
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class CodeWarsTwoOldestAges : StringSpec() {

    init {
        "twoOldestAges(listOf(1,5,87,45,8,8)) should be listOf(45, 87)" {
            twoOldestAges(listOf(1,5,87,45,8,8)) shouldBe listOf(45, 87)
        }
        "twoOldestAges(listOf(6,5,83,5,3,18)) should be listOf(18, 83)" {
            twoOldestAges(listOf(6,5,83,5,3,18)) shouldBe listOf(18, 83)
        }
    }
}