package chapter03

var opCount = 0 // 최상위 프로퍼티를 선언한다.

fun performOperation() {
    opCount++ // 최상위 프로퍼티의 값을 변경한다.
    //...
}

fun reportOperationCount(){
    println("Operation performed $opCount times") // 최상위 프로퍼티의 값을 읽는다.
}

//코드에 상수 추가
val UNIX_LINE_SEPARATOR = "\n"

// const 변경자 추가
const val UNIX_LINE_SEPARATOR2 ="\n"

class Property {
}