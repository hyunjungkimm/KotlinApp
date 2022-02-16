package chapter02 // 패키지 선언

import java.util.Random // 표준 자바 라이브러리 클래스를 임포트한다.

class Rectangle(val height : Int, val width:Int) {
    val isSequre : Boolean
        get(){ //프로퍼티 게터 선언
            return height==width
        }
}

fun createRandomRectangle() : Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}


