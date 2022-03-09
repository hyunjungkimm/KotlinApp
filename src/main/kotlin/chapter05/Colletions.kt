package chapter05

class Colletions {
}

fun main() {
    val list = listOf(1,2,3,4)
    println(list.filter{ it % 2 ==0 })//[2, 4]

    println(list.map{ it * it })//[1, 4, 9, 16]

    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    println(people.map { it.name } )//[Alice, Bob]
    println(people.map(Person::name))//[Alice, Bob]

    println(people.filter { it.age > 30  }.map(Person::name))//[Bob]

    people.filter{ it.age == people.maxByOrNull(Person::age)!!.age}

    val maxAge = people.maxByOrNull(Person::age)!!.age

    people.filter{it.age == maxAge}

    val numbers = mapOf(0 to "zero", 1 to "one")
    println(numbers.mapValues { it.value.toUpperCase() }) // {0=ZERO, 1=ONE}
}