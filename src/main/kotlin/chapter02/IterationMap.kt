package chapter02

import java.util.*

class IterationMap {
}

fun main(args:Array<String>){
    val binaryReps = TreeMap<Char, String>() //키에 대해 정렬하기 위해 TreeMap을 사용한다.

    for(c in 'A'..'F'){ //A부터 F까지 문자의 범위를 사용해 이터레이션한다.
        val binary = Integer.toBinaryString(c.code)//아스키 코드를 2진 표현으로 바꾼다.
        binaryReps[c] = binary //c를 키로 c의 2진 표현을 맵에 넣는다.
    }

    for((letter, binary) in binaryReps) { //맵에 대해 이터레이션한다. 맵의 키와 값을 두 변수에 각각 대입한다.
        println("$letter = $binary")
    }

    val list = arrayListOf("10","11","1001")
    for((index, element) in list.withIndex()){///인덱스와 함께 컬렉션을 이터레이션한다.
        println("$index: $element")
    }

    //in을 사용해 값이 범위에 속하는지 검사하기
    fun isLetter(c:Char) = c in 'a'..'z' || c in 'A'..'Z'
    fun isNotDigit(c:Char) = c !in '0'..'9'

    println(isLetter('q')) //true
    println(isNotDigit('x')) //true

    //when에서 in 사용하기
    fun recognize(c:Char) = when(c) {
        in '0'..'9' -> "It's a digit!" //c 값이 0부터 9사이에 있는지 검사한다.
        in 'a'..'z', in 'A'..'Z' -> "It's a letter" //여러 범위 조건을 함께 사용해도 된다.
        else -> "I don't know.."
    }

    println(recognize('8'))//It's a digit!

    println("Kotlin" in "Java".."Scala")//true

    println("Kotlin" in setOf("Java", "Scala"))//false
}

