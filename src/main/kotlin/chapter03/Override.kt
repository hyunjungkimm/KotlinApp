package chapter03

open class View{
    open fun click() = println("View clicked")
}
class Button:View() {
    override fun click() = println("Button clicked")
}

//확장함수는 오버라이드 할 수 없다.
fun View.showOff() = println("I'm a view!")
fun Button.showOff() = println("I'm a button!")



fun main(args:Array<String>){
    val view :View = Button()
    view.click() // "view"에 저장된 값의 실제 타입에 따라 호출할 메소드가 결정된다.
    //Button clicked

    view.showOff()//I'm a view!
}

class Override {
}