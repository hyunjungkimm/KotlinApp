package chapter06

class Address(
    val streetAddress : String,
    val zipCode : Int,
    val city : String,
    val country : String
)

class Company(
    val name : String,
    val address : Address?
)

class Person(
    val name : String,
    val company: Company?
)

fun printShippingLabel(person : Person){
    val address = person.company?.address
        ?: throw IllegalArgumentException("No address") // 주소가 없으면 예외를 발생시킨다.
    with(address) { //"address"는 널이 아니다.
        println(streetAddress)
        println("$zipCode $city $country")
    }
}

fun main() {

    val address = Address("Elsestr. 47", 80687 ,"Munich", "Germany")
    val jetbrains = Company("JetBrains", address)
    val person_ = Person("Dmitry", jetbrains)

    printShippingLabel(person_)
    printShippingLabel(Person("Alexey",null))//java.lang.IllegalArgumentException: No address

    val person = Person("Dmitry", null)
    println(person.countryName())//Unknown

    println(person.countryNameNull())//unKnwon
}

fun Person.countryName() : String {
    val country = this.company?.address?.country //여러 안전한 호출 연산자를 연쇄해 사용한다.
    return if(country != null) country else "Unknown"
}

fun Person.countryNameNull() = company?.address?.country ?: "unKnown"

fun foo(s:String?){
    val t: String = s ?: "" //"s"가 null이면 결과는 빈 문자열("")이다
}

