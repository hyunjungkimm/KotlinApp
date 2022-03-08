package chapter04.chapter04_01

//열린 메소드를 포함하는 열린 클래스 정의하기
open class RichButton : Clickable { // 이 클래스는 열려있다. 다른 클래스가 이 클래스를 상속할 수 있다.

    fun disable(){}//이 함수는 final이다. 하위 클래스가 이 메소드를 오버라이드할 수 없다.

    open fun animate(){} // 이 함수는 열려있다. 하위 클래스에서 이 메소드를 오버라이드할 수 있다.

    override fun click() {}//이 함수는 (상위 클래스에서 선언된) 열려있는 메소드르 오버라이드 한다. 오버라이드한 메소드는 기본적으로 열려있다.

}

//오버라이드 금지하기
open class RichButton2 : Clickable {

   final override fun click() {}//여기 있는 'final'은 쓸데 없이 붙은 중복이 아니다. 'final'이 없는 'override' 메소드나 프로퍼티는 기본적으로 열려있다.

}

abstract class Animated { // 이 클래스는 추상 클래스다. 이 클래스의 인스턴스를 만들 수 없다.
    abstract fun animate() // 이 함수는 추상 함수다. 이 함수에는 구현이 없다. 하위 클래스에서는 이 함수를 반드시 오버라이드 해야 한다.

    open fun stopAnimating(){}
                                // 추상 클래스에 속했더라도 비추상 함수는 기본적으로 파이널이지만 원한다면 open으로 오버라이드를 허용할 수 있다.
    fun animateTwice(){}

}