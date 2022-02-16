package chapter02

interface Expr

class Num(val value: Int) : Expr

class Sum(val left : Expr, val right : Expr) : Expr

//if문
fun eval(e:Expr) : Int {
    if(e is Num){
        val n = e as Num //여기서 Num타입을 변환하는데, 이는 불필요한 중복이다.
        return n.value
    }

    if(e is Sum){
        return eval(e.right) + eval(e.left)//변수 e에 대해 스마트 캐스트를 사용한다.
    }

    throw IllegalArgumentException("Unknown expression")
}

fun evalIf(e:Expr) : Int =
    if(e is Num) e.value
    else if(e is Sum){
        eval(e.right) + eval(e.left)
    }else {
        throw IllegalArgumentException("Unknown expression")
    }

fun evalWhen(e:Expr) : Int =
    when(e) {
        is Num ->  //인자 타입을 검사하는 when 분기들
            e.value //이 부분에 스마트 캐스트가 쓰임
        is Sum -> //인자 타입을 검사하는 when 분기들
            eval(e.right) + eval(e.left) //이 부분에 스마트 캐스트가 쓰임
        else ->
            throw IllegalArgumentException("Unknown expression")
    }

fun evalWithLogging(e:Expr) : Int =
    when(e){
        is Num -> {
            println("num : ${e.value}")
            e.value // 이 식이 블록의 마지막 식이므로 e의 타입이 Num이면 e.value가 반환된다.
        }

        is Sum -> {
            val left = evalWithLogging(e.left)
            val right = evalWithLogging(e.right)
            println("sum : $left + $right")
            left+right //e의 타입이 Sum이면 이 식의 값이 반환된다.
        }

        else -> throw IllegalArgumentException("UnKnown expression")
    }
