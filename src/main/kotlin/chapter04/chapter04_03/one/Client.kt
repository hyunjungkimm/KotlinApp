package chapter04.chapter04_03.one

class Client(val name : String, val postalCode : Int) {

    override fun equals(other:Any?) : Boolean { // Any 코틀린의 모든 클래스의 최상위 클래스. "Any?"는 널이 될 수 있는 타입이므로 "ohter"는 null일 수 있다.
        if(other == null || other !is Client) //"other"가 client인지 검사하낟.
            return false
        return name == other.name && //두 객체의 프로퍼티 값이 서로 같은지 검사한다.
                postalCode == other.postalCode

    }
    override fun toString() = "Client(name=$name, postalCode=$postalCode)"

    override fun hashCode() : Int = name.hashCode() * 31 + postalCode


    fun copy(name : String = this.name, postalCode: Int = this.postalCode) =
        chapter04.chapter04_03.two.Client(name, postalCode)

}


fun main() {
    val client1 = Client("오현석", 4122)
    println(client1) //Client(name=오현석, postalCode=4122)

    val processed = hashSetOf(Client("오현석", 4122))
    println(processed.contains(Client("오현석", 4122))) //true

    val lee = Client("이계영", 4122)
    println(lee.copy(postalCode = 4000)) // Client(name=이계영, postalCode=4000)

}