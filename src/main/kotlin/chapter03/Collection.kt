package chapter03
class chapter03 {

}

fun main(args: Array<String>){
    val set = hashSetOf(1, 7, 53)
    val list = arrayListOf(1,7, 53)
    val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

    println(set.javaClass) //class java.util.HashSet
    println(list.javaClass)//class java.util.ArrayList
    println(map.javaClass) //class java.util.HashMap

    val strings = listOf("first", "second", "fourteenth")
    println(strings.last()) //fourteenth
    val numbers = setOf(1, 14, 2)
    println(numbers.maxOrNull()) //14 -- max()함수 사용 x

}