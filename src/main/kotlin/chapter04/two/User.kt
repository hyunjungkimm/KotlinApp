package chapter04.two

class User (val _nickname:String,//생성자 파라미터에 대한 디폴트 값을 제공한다.
            val isSubscribed:Boolean = true)

fun main() {
    val hyun = User("현석")
    println(hyun.isSubscribed)//true

    val gye = User("계영", false) //모든 인자를 파라미터 선언 순서대로 지정할 수도 있다.
    println(gye.isSubscribed)//false

    val hey = User("혜원", isSubscribed = false)// 생성자 인자 중 일부에 대해 이름을 지정할 수도 있다.
    println(hey.isSubscribed)//false

}

open class User2(val nickname:String){ }
class TwitterUser(nickname:String) : User2(nickname){}

open class Button // 인자가 없는 디폴트 생성자가 만들어진다.
class RadioButton:Button()

class Secreative private constructor(){} // 이 클래스의 (유일한) 주 생성자는 비공개다