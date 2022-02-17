package chapter03.strings

//확장 프로퍼티 선언하기
val String.lastChar:Char
    get() = get(length -1)

//변경 가능한 확장 프로퍼티 선언하기
var StringBuilder.lastChar : Char
    get() = get(length -1)//프로퍼티 ㅔ게터
    set(value:Char){
        this.setCharAt(length -1, value) //프로퍼티 세터
    }

fun main(args:Array<String>){
    println("Kotlin".lastChar) //n

    val sb= StringBuilder("Kotlin?")
    sb.lastChar = '!'
    println(sb)//Kotlin!
}
class ExtensionProperty {
}