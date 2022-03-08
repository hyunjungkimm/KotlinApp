package chapter04.chapter04_01

import java.io.Serializable


interface State: Serializable

interface View {
    fun getCurrentState() : State
    fun restoreState(state : State) {}
}

