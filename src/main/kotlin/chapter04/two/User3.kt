package chapter04.two

interface User3 {
    val nickname : String
}

class PrivateUser(override val nickname : String) : User3 // 주 생성자에 있는 프로퍼티

class SubscribingUser(val email : String) : User3 {
    override val nickname : String
        get() = email.substringBefore('@') //커스텀 게터
}
/*
class FacebookUser(val accountId : Int) : User3{
    override val nickname = getFacebookName(accountId) // 프로퍼티 초기화 식


}*/

fun main() {
    println(PrivateUser("tets@kotlinlang.org").nickname) //tets@kotlinlang.org
    println(SubscribingUser("tets@kotlinlang.org").nickname) //tets
}

