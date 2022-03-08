package chapter04.chapter04_04.chapter04_04_01

import java.awt.Window
import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent


fun countClicks(window:Window){
    var clickCount = 0 //로컬 변수를 정의한다.
    window.addMouseListener(object : MouseAdapter(){
        override fun mouseClicked(e: MouseEvent) {
            clickCount++ //로컬 변수의 값을 변경한다.
        }
    })
}
fun main() {
    val listner = object : MouseAdapter() {
        override fun mouseClicked(e: MouseEvent) {
            super.mouseClicked(e)
        }

        override fun mouseEntered(e: MouseEvent) {
            super.mouseEntered(e)
        }
    }
}

