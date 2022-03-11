package chapter05

class Colletions {
}

fun main() {
    val list = listOf(1,2,3,4)
    println(list.filter{ it % 2 ==0 })//[2, 4]

    println(list.map{ it * it })//[1, 4, 9, 16]

    val people = listOf(Person("Alice", 27), Person("Bob", 31))
    println(people.map { it.name } )//[Alice, Bob]
    println(people.map(Person::name))//[Alice, Bob]

    println(people.filter { it.age > 30  }.map(Person::name))//[Bob]

    people.filter{ it.age == people.maxByOrNull(Person::age)!!.age}

    val maxAge = people.maxByOrNull(Person::age)!!.age

    people.filter{it.age == maxAge}

    val numbers = mapOf(0 to "zero", 1 to "one")
    println(numbers.mapValues { it.value.toUpperCase() }) // {0=ZERO, 1=ONE}


    //술어
    val canBeInClub27 = { p:Person -> p.age<=27 }
    println(people.all(canBeInClub27))//false
    println(people.any(canBeInClub27))//true

    val list2 = listOf(1,2,3);
    println(!list2.all{it == 3}) // true
    println(list.any{it != 3}) // true

    println(people.count(canBeInClub27)) // 1
    println(people.filter(canBeInClub27).size)//1

    println(people.find(canBeInClub27))//Person(name=Alice, age=27)

    //groupBy
    val people3 = listOf(Person("Alice", 31), Person("Bob", 29), Person("Carol", 31))
    println(people3.groupBy{it.age}) //{31=[Person(name=Alice, age=31), Person(name=Carol, age=31)], 29=[Person(name=Bob, age=29)]}

    //문자열을 첫 글자 따라 분류
    val list3 = listOf("ab", "a", "b")
    println(list3.groupBy(String::first))//{a=[ab, a], b=[b]}

}