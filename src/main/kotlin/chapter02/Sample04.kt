package chapter02

fun main(args: Array<String>){

    println("Hello, ${if (args.size>0) args[0] else "someone"}") //Hello, someone

    val name = if(args.size > 0) args[0] else "Kotlin"
    println("Hello, ${name}님 반가워요!")//"Bob"을 인자로 넘기면 "Hello, Bob!"을 출력하고 아무 인자도 없으면 "Hello, Kotlin!" 을 출력한다.

    if(args.size>0) {
        println("Hello, ${args[0]} !") // args 배열의 첫 번째 원소를 넣기 위해 ${} 구문을 사용한다.
    }

}

class Sample04 {
}