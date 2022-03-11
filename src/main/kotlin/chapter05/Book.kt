package chapter05

import java.io.File

class Book(val title : String, val authors : List<String>)


fun main() {
    val strings = listOf("abc", "def")
    println(strings.flatMap{ it.toList() }) //[a, b, c, d, e, f]

    val books = listOf(Book("Thrusday Next" , listOf("Jasper Fforde"))
                        ,Book("Mort", listOf("Terry Pratchett"))
                        ,Book("Good Omens", listOf("Terry Pratchett", "Neil Gaiman")))

    println(books.flatMap{it.authors}.toSet()) // books 컬렉션에 있는 책을 쓴 모든 저자의 집합
    //[Jasper Fforde, Terry Pratchett, Neil Gaiman]



    val people = listOf(Person("Alice", 27), Person("Bob", 31))
    println(people.map(Person::name).filter{it.startsWith("A")})//[Alice]

    // -- 원본 컬렉션을 시퀀스로 변환한다.
    people.asSequence()
        // -- 시퀀스도 컬렉션과 똑같은 API를 제공한다.
        .map(Person::name)
        .filter{it.startsWith("A")}
        // -- 결과 시퀀스를 다시 리스트로 변환한다.
        .toList()


    listOf(1,2,3,4).asSequence()
        .map{ print("map($it)"); it*it }
        .filter { print("filter($it) "); it % 2 == 0 }
        .toList()
    //map(1)filter(1) map(2)filter(4) map(3)filter(9) map(4)filter(16)

    println()

    println(listOf(1,2,3,4).asSequence()
        .map{ it*it }
        .find {it > 3}) //4

    val people2 = listOf(Person("Alice", 29), Person("Bob", 31),
                        Person("Charles", 31), Person("Dan", 21))
    println(people2.asSequence().map(Person::name)
        .filter{ it.length < 4 }
        .toList())//[Bob, Dan]


    println(people2.asSequence().filter{ it.name.length < 4 }
        .map(Person::name)
        .toList())//[Bob, Dan]

    val naturalNumbers = generateSequence(0){ it + 1 }
    val numbersTo100 = naturalNumbers.takeWhile{it<=100}
    println(numbersTo100.sum())//모든 지연 연산은 최종 연산인 "sum"이 결과를 계산할 때 수행된다.
    //5050

    fun File.isInsideHidedenDirectory() = generateSequence(this) {it.parentFile}.any {it.isHidden }

    val file = File("/Users/svtk/.HiddenDir/a.txt")
    println(file.isInsideHidedenDirectory())//true


}