package chapter03

class CollectionAPI {

}

fun main(args:Array<String>){
    val strings:List<String> = listOf("first", "second", "Fourteenth")
    println(strings.last()) // Fourteenth

    val numbers:Collection<Int> = setOf(1,14,2)
    println(numbers.maxOrNull()) // 14

    val list = listOf(2, 3, 5, 7, 11)

    //스프레드 연산자
    val list2 = listOf("args:", *args)//스프레드 연산자가 배열의 내용을 펼쳐준다.
    println(list) // [2, 3, 5, 7, 11]

    val map = mapOf(1 to "one" , 7 to "seven", 53 to "fifty-three")

    1.to("one") //"to" 메소드를 일반적인 방식으로 호출
    1 to "one"       //"to" 메소드를 중위 호출 방식으로 호출

    val(number, name) = 1 to "one"

}