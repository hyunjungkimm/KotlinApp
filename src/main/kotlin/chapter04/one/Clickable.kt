package chapter04.one

//인터페이스 안에 본문이 있는 메소드 정의하기
interface Clickable {
    fun click()//일반 메소드 선언
    fun showOff() = println("I'm clickable!") //디폴트 구현이 있는 메소드
}
//동일한 메소드를 구현하는 다른 인터페이스 정의
interface Focusable {
    fun setFocus(b:Boolean) =
        println("I ${if (b) "got" else "lost"} focus.")
    fun showOff() = println("I'm focusable!")
}

//상속한 인터페이스의 메소드 구현 호출하기
class Button : Clickable, Focusable {
    override fun click() = println("I was clicked")
    override fun showOff() { // -- 1
        super<Clickable>.showOff() // -- 2
        super<Focusable>.showOff() // -- 2
    }
}

fun main() {
    Button().click() // I was clicked

    val button = Button()
    button.showOff()
    /*
      I'm clickable!
      I'm focusable!
    */
    button.setFocus(true) //I got focus.
    button.click() //I was clicked

}