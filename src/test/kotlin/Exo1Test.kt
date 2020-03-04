import com.oodrive.hermes.kata.Exo1.calculate
import com.oodrive.hermes.kata.Exo1.getKidNames
import com.oodrive.hermes.kata.Exo1.getOldestPerson
import com.oodrive.hermes.kata.Exo1.getString
import com.oodrive.hermes.kata.Exo1.namesToString
import com.oodrive.hermes.kata.Exo1.partitionAdults
import com.oodrive.hermes.kata.Exo1.transform
import com.oodrive.hermes.kata.Exo1.Person
import com.oodrive.hermes.kata.Exo1.Person.Person1
import io.kotlintest.matchers.collections.shouldContainAll
import io.kotlintest.matchers.collections.shouldNotContainAll
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class Exo1Test : StringSpec() {

    private val VOID_PERSON_1_WITH_NULL = Person1(null, null)
    private val VOID_PERSON_2_WITH_NULL = Person.Person2("", 0)

    init {
        "transform should flatten collection" {
            val collection = listOf(listOf("Viktor", null, "Farcic"), listOf("John", "Doe", "Third"))
            val expected = listOf("Viktor", "Farcic", "John", "Doe", "Third")
            transform(collection) shouldBe (expected)
        }

        "get oldestPerson should return oldest person" {
            val sara: Person = Person1("Sara", 4)
            val viktor: Person = Person1("Viktor", 40)
            val eva: Person = Person1("Eva", 42)

            val person1s = listOf(sara, eva, null, VOID_PERSON_1_WITH_NULL, viktor)

            getOldestPerson(person1s) shouldBe eva
        }

        "calculate should sum all numbers" {
            calculate(listOf(1, 2, 3, 4, 5)) shouldBe 1 + 2 + 3 + 4 + 5
        }

        "get kid name should return names of all kids under 18" {
            val sara: Person = Person1("Sara", 4)
            val viktor: Person = Person1("Viktor", 40)
            val eva: Person = Person1("Eva", 42)
            val anna: Person = Person1("Anna", 5)

            val persons = listOf(sara, eva, VOID_PERSON_1_WITH_NULL, viktor, anna)

            getKidNames(persons) shouldContainAll listOf("Sara", "Anna")
            getKidNames(persons) shouldNotContainAll listOf("Viktor", "Eva")
        }

        "partition adults should separate kids from adults" {
            val sara: Person = Person1("Sara", 4)
            val viktor: Person = Person1("Viktor", 40)
            val eva: Person = Person1("Eva", 42)

            val personne1s = listOf(sara, eva, null, VOID_PERSON_1_WITH_NULL, viktor)
            val partitionAdults: Map<Boolean, List<Person>> = partitionAdults(personne1s)

            partitionAdults.getValue(true) shouldContainAll listOf(viktor, eva)
            partitionAdults.getValue(false) shouldContainAll listOf(sara)
        }

        "group by nationality" {
            val sara: Person = Person1("Sara", 4)
            val viktor: Person = Person1("Viktor", 40)
            val eva: Person = Person1("Eva", 42)

            val person2s = listOf(sara, viktor, null, VOID_PERSON_2_WITH_NULL, eva)

            namesToString(person2s) shouldBe "Names: Sara, Viktor, Eva."
        }

        "get string should output even uneven string" {
            getString(listOf(3, null, 44)) shouldBe "o3,e44"
            getString(listOf(3)) shouldBe "o3"
        }
    }
}