import com.oodrive.hermes.kata.getHottestDay
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import kotlinx.coroutines.async

class Exo3Test : StringSpec() {
    init {
        "longestCommonSequence void" {
            val async = async {
                getHottestDay()
            }
            async.await()[0] shouldBe "  Dy MxT   MnT   AvT   HDDay  AvDP 1HrP TPcpn WxType PDir AvSp Dir MxS SkyC MxR MnR AvSLP"
        }
    }

}