package chapter02

class Iteration {
}

fun fizzBuzz(i : Int) = when {
    i % 15 == 0 -> "FizzBuzz"
    i % 3 == 0 -> "Fizz"
    i % 5 == 0 -> "Buzz"
    else -> "$i" // 다른경우에는 그 수 자체를 반환한다.
}

fun main(args: Array<String>){
    for(i in 1..100){
        print(fizzBuzz(i) +" ") // 1 2 Fizz 4 Buzz Fizz 7...
    }
    println()
    //100부터 거꾸로 세되 짝수만으로 게임 진행
    for(i in 100 downTo 1 step 2){
        print(fizzBuzz(i) +" ")
    }
}