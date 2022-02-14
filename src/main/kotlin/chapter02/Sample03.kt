package chapter02

fun main(args: Array<String>){
    val languages = arrayListOf("Java") // 불변 참조를 선언한다.
    languages.add("Kotlin") // 참조가 가리키는 객체 내부를 변경한다.

    println(languages)//[Java, Kotlin]

    //var answer = 42
    //answer="no answer" -- Type mismatch
}



class Sample03 {
    
}