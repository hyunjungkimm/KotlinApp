package chapter06.chapter06_01

class People(val firstName:String, val lastName :String) {
    override fun equals(o: Any?): Boolean {
        val otherPerson = o as? People ?: return false // 타입이 일치 하지 않으면 false를 반환한다.

        //안전한 캐스트를 하고 나면 otherPerson이 Person 타입으로 스마트 캐스트 된다.
        return otherPerson.firstName == firstName &&
                otherPerson.lastName == lastName

    }

    override fun hashCode(): Int =
        firstName.hashCode() * 37 + lastName.hashCode()
}

fun ignoreNulls(s:String?){
    val sNotNull : String = s!! //예외는 이 지점을 가리킨다.
    println(sNotNull.length)
}

fun sendEmailTo(email:String){
    println("Sending email to $email")
}
fun verifyUserInput(input:String?){
    if(input.isNullOrBlank()) { // 안전한 호출을 하지 않아도 된다.
        println("Please fill in the required fields")
    }
}

fun <T> printHashCode(t:T){
    println(t?.hashCode()) // "t"가 null이 될 수 있으므로 안전한 호출을 써야만 한다.

}

fun <T:Any> printHashCodeT(t:T){// 이제 "T"는 널이 될 수 없는 타입이다.
    println(t.hashCode())
}

fun main() {

    //printHashCodeT(null) //이 코드는 컴파일되지 않는다. 널이 될 수 없는 타입의 파라미터에 널을 넘길 수 없다.
    printHashCodeT(42)//42

    //"T"의 타입은 "Any?"로 추론된다.
    printHashCode(null)//null

    verifyUserInput(" ")//Please fill in the required fields
//isNullOrBlank에 "null"을 수신 객체로 전달해도 아무런 예외가 발생하지 않는다.
    verifyUserInput(null)//Please fill in the required fields

    var email : String ? ="yole@example.com"
    email?.let{ sendEmailTo(it)} //Sending email to yole@example.com

    email = null
    email?.let{ sendEmailTo(it)}

    val p1 = People("Dmitry", "Jemerov")
    val p2 = People("Dmitry", "Jemerov")

    println(p1==p2) //true

    println(p1.equals(42)) //false

    //ignoreNulls(null)
}

