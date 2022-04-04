package chapter06.chapter06_04

class Arr {
}

fun main(args:Array<String>) {
    for(i in args.indices){// 배열의 인덱스 값의 범위에 대해 이터레이션하기 위해 array.indices 확장 함수를 사용한다.
        println("Argument $i is: ${args[i]}") // array[index]로 접근해서 배열 원소에 접근한다.
    }

    val letters = Array<String>(26){ i -> ('a' + i).toString()}
    println(letters.joinToString("")) //abcdefghijklmnopqrstuvwxyz

    val strings = listOf("a", "b", "c")
    println("%s/%s/%s".format(*strings.toTypedArray())) //vararg 인자를 넘기기 위해 스프레드 연산자(*)를 써야함
    //a/b/c

    val fiveZeros = IntArray(5)
    val fiveZerosToo = intArrayOf(0,0,0,0,0)
    val squares = IntArray(5) {i -> (i+1) * (i+1)}
    println(squares.joinToString())//1, 4, 9, 16, 25
}

