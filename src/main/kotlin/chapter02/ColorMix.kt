package chapter02

import chapter02_1.Color
import chapter02_1.Color.*;

class ColorMix {

}
fun mix(c1:Color, c2: Color) =
    //when 식의 인자로 아무 객체나 사용할 수 있다.
    //when은 이렇게 인자로 받은 객체가 각 분기 조건에 있는 객체와 같은지 테스트 한다.
    when(setOf(c1,c2)){
        //두 색을 혼합해서 다른 색을 만들 수 있는 경우를 열거한다.
        setOf(RED, YELLOW) -> ORANGE
        setOf(YELLOW, BLUE) -> GREEN
        setOf(BLUE, VIOLET) -> INDIGO
        else -> throw Exception("Dirty color")//매치되는 분기 조건이 없으면 이 문장을 실행한다.

    }

fun mixOptimized(c1:Color, c2:Color) =
    when{
        (c1 == RED && c2 == YELLOW) || (c1 == YELLOW && c2 == RED) -> ORANGE
        (c1 == YELLOW && c2 == BLUE) || (c1 == BLUE && c2 == YELLOW) -> GREEN
        (c1 == BLUE && c2 == VIOLET) || (c1 == VIOLET && c2 == BLUE) -> INDIGO
        else -> throw Exception("Dirty color")
    }
