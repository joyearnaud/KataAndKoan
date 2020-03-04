import com.oodrive.hermes.kata.extractFileName
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class CodewarsExtractFileNameTest : StringSpec() {

    init {
        "extractFileName1" {
            extractFileName("1231231223123131_FILE_NAME.EXTENSION.OTHEREXTENSION") shouldBe "FILE_NAME.EXTENSION"
        }
        "extractFileName2" {
            extractFileName("1_FILE_NAME.EXTENSION.OTHEREXTENSIONadasdassdassds34") shouldBe "FILE_NAME.EXTENSION"
        }
    }

}