package com.oodrive.hermes.kata

object Exo1 {
    //    open class Person constructor(open val name: String?)
    sealed class Person constructor(open val name: String?, open val age: Int?) {
        data class Person1 @JvmOverloads constructor(override val name: String?, override val age: Int?, val nationality: String = "") : Person(name, age)
        data class Person2 @JvmOverloads constructor(override val name: String, override val age: Int, val address: String = "") : Person(name, age)
    }

    enum class USER(val privilege: Int) {
        TOTO(0), TATA(0), TITI(1)
    }

    data class Person3<E> @JvmOverloads constructor(val name: String?, val age: Int?, val nationality: String = "", val type: E)

    private val DEFAULT_PERSON_1: Person = Person.Person1("", 0, "")
    private val DEFAULT_PERSON_2: Person = Person.Person2("", 0, "")
    private val DEFAULT_PERSON_3: Person3<USER> = Person3("", 0, "", USER.TITI)


    @JvmStatic
    fun testingThings(collection: List<List<String?>>): List<String> {
        val privilege = DEFAULT_PERSON_3.type.privilege
        DEFAULT_PERSON_3.copy(type = USER.TATA)
        return collection
                .flatMap { it.toList() }
                .filterNotNull()
    }

    @JvmStatic
    fun transform(collection: List<List<String?>>): List<String> {
        return collection
                .flatMap { it.toList() }
                .filterNotNull()
    }

    @JvmStatic
    fun getOldestPerson(people: List<Person?>): Person {
        return people
                .filterNotNull()
                .maxBy { it.age ?: 0 } ?: DEFAULT_PERSON_1
    }

    @JvmStatic
    fun getOldestPerson2(people: List<Person.Person2?>): Person {
        return people
                .filterNotNull()
                .maxBy { it.age } ?: DEFAULT_PERSON_2
    }

    @JvmStatic
    fun calculate(numbers: List<Int?>): Int {
        return numbers
                .filterNotNull()
                .fold(initial = 0) { number1: Int, number2: Int -> number1 + number2 }
    }

    @JvmStatic
    fun getKidNames(people: List<Person?>): Set<String> {
        return people
                .filterNotNull()
                .filter { 18 > it.age ?: 0 }
                .map { it.name ?: "" }
                .toSet()
    }

    @JvmStatic
    fun partitionAdults(people: List<Person?>): Map<Boolean, List<Person>> {
        val (adult, young) = people.filterNotNull()
                .filter { null !== it.age && !it.name.isNullOrBlank() }
                .partition { it.age ?: 0 >= 18 }
        return mapOf(true to adult, false to young)
    }

    @JvmStatic
    fun groupByNationality(people: List<Person.Person1?>): Map<String, List<Person.Person1>> {
        return people
                .filterNotNull()
                .groupBy { it.nationality }
    }

    @JvmStatic
    fun namesToString(people: List<Person?>): String {
        return people
                .filterNotNull()
                .filter { !it.name.isNullOrBlank() }
                .joinToString(separator = ", ", prefix = "Names: ", postfix = ".") { it.name ?: "" }
    }


    @JvmStatic
    fun getString(list: List<Int?>): String {
        return list
                .filterNotNull()
                .joinToString(separator = ",") { if (0 == it % 2) String.format("e%d", it) else String.format("o%d", it) }
    }
}