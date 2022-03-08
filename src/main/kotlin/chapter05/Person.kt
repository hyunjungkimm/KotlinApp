package chapter05

data class Person(val name : String, val age : Int)

fun main() {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    println(people.maxByOrNull { it.age })//나이 프로퍼티를 비교해서 값이 가장 큰 원소 찾기
    //Person(name=Bob, age=31)

    people.maxByOrNull(Person::age)


    val sum = {x:Int, y:Int -> x+y}
    println(sum(1,2))//3  --- 변수에 저장된 람다를 호출한다.

    run{ println(42)}//42
}
