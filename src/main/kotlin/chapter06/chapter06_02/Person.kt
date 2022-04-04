package chapter06.chapter06_02

class Person(val name: String,
             val age: Int?= null) {
    fun isOlderThan(other:Person) :Boolean?{
        if(age == null || other.age == null)
            return null
        return age > other.age
    }
}

fun foo(l:Long) = println(l)

fun fail(message:String):Nothing {
    throw IllegalArgumentException(message)
}


fun main() {


    //fail("Error occurred")

    val answer: Any =42

    println("42".toInt())

    val b : Byte = 1// 상수 값은 적절한 타입으로 해석된다.
    val s = b + 1L // +는 Byte와 Long을 인자로 받을 수 있다.
    foo(42) //컴파일러는 42를 Long 값으로 해석한다.

    println(Person("Sam", 35).isOlderThan(Person("Amy", 42)))//false
    println(Person("Sam", 35).isOlderThan(Person("Jane")))//null

    val i = 1
    val l:Long = i.toLong()

    val x = 1
    println(x.toLong() in listOf(1L,2L,3L))//true


}