package chapter04.one

internal open class TalkativeButton : Focusable {
    private fun yell() = println("Hey!")
    protected fun whisper() = println("Let's talk!")
}

/*
fun TalkativeButton.giveSpeech(){//오류 : public 멤버가 자신의 internal 수신 타입인 TalkativeButton을 노출함
    yell()// private 멤버여서 접근 불가
    whisper() //protected 멤버여서 접근 불가
}
*/