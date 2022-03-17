package chapter05

import java.awt.SystemColor.text
import javax.naming.Context

class Button {

}

fun createAllDoneRunnable() : Runnable {
    return Runnable { println("All done") }
}

fun alphabet() : String {
    val result = StringBuilder()
    for(letter in 'A'..'Z') {
        result.append(letter)
    }
    result.append("\nNow I know the alphabet!")
    return result.toString()
}

fun withAlphabet() : String {
    val stringBuilder = StringBuilder()
    return with (stringBuilder) {// 메소드를 호출하려는 수신 객체를 지정한다.
        for(letter in 'A' .. 'Z') {
            this.append(letter) //"this"를 명시해서 앞에서 지정한 수신 객체의 메소드를 호출한다.
        }
        append("\nNow I know the alphabet!") // "this"를 생략하고 메소드를 호출한다.
        this.toString()// 람다에서 값을 소환한다.
    }
}

fun withAndAlphabet() = with(StringBuilder()) {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!") // "this"를 생략하고 메소드를 호출한다.
    toString()
}

fun applyalphabet() = StringBuilder().apply {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!") // "this"를 생략하고 메소드를 호출한다.
}.toString()

fun buildalphabet() = buildString {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!") // "this"를 생략하고 메소드를 호출한다.
}


fun main() {
    createAllDoneRunnable().run() //All done

    println(alphabet())

    println(withAlphabet())

    println(withAndAlphabet())
    /*
    ABCDEFGHIJKLMNOPQRSTUVWXYZ
    Now I know the alphabet!
    */
}

