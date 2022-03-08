package chapter04.chapter04_02

interface User4 {
    val email : String
    val nickname : String
        get() = email.substringBefore('@') // 프로퍼티에 뒷받침하는 필드가 없다. 대신 매번 결과를 계산해 돌려준다.
}