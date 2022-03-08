package chapter02

import chapter02.chapter02_1.Color // 다른 패키지에서 정의한 Color 클래스를 임포트한다.
import chapter02.chapter02_1.Color.*; // 짧은 이름을 사용하기 위해 enum 상수를 모두 임포트한다.

class JavaPerson {

}
fun getMnemonic(color: Color) = //함수의 반환 값으로 when 식을 직접 사용한다.
    when (color){//색이 특정 enum 상수와 같을 때 그 상수에 대응하는 문자열을 돌려준다 .
        Color.RED -> "Richard"
        Color.ORANGE -> "Of"
        Color.YELLOW -> "York"
        Color.GREEN -> "Gave"
        Color.BLUE -> "Battle"
        Color.INDIGO -> "In"
        Color.VIOLET -> "Vain"
    }

fun getWarmth(color: Color) = when(color){
    RED, ORANGE, YELLOW -> "warm" //임포트한 enum 상수를 이름만으로 사용한다.
    GREEN ->"neutral"
    BLUE, INDIGO, VIOLET -> "cold"
}

fun main(args: Array<String>) {
    val person = Person("Bob", true)
    println(person.name)//Bob
    println(person.isMarried)//true

    val rectangle = Rectangle(41,43)
    println(rectangle.isSequre);//false

    println(Color.BLUE.rgb())//255

    println(getMnemonic(Color.BLUE))//Battle

    println(getWarmth(Color.ORANGE))//warm

    println(mix(BLUE,YELLOW))//GREEN

    println(mixOptimized(BLUE,YELLOW))//GREEN

    println(eval(Sum(Sum(Num(1),Num(2)),Num(4)))) //7

    println(eval(Sum(Num(1), Num(2)))) //3

    println(evalWithLogging(Sum(Sum(Num(1),Num(2)),Num(4))))

}