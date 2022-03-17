package chapter06

class Null {

}

fun strLen(s:String) = s.length

//메소드 직접 호출 불가 - Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?
//fun strLenSafe(s:String?) = s.length()

fun strLenSafe(s:String?) :Int =
    if(s != null) s.length else 0 //null 검사를 추가하면 코드가 컴파일된다.

fun strLenSafeNull(s:String?) : Int = s?.length ?: 0

fun printAllCaps(s: String?){
    val allCaps : String? = s?.toUpperCase() //allCaps는 널일 수도 있다.
    println(allCaps)
}


fun main() {

    println(strLenSafeNull("abc"))//3
    println(strLenSafeNull(null))//0

    printAllCaps("abc") // ABC
    printAllCaps(null) // null

    val y : String? = null
    println(strLenSafe(y)) // 0
    println(strLenSafe("abc")) // 3

    //strLen(null) //Null can not be a value of a non-null type String

    //널이 될 수 있는 값을 널이 될 수 없는 타입의 변수에 대입 불가
    //val y : String = x//Type mismatch: inferred type is String? but String was expected
    val x : String? = null
    //val y : String = x

    //널이 될 수 있는 타입의 값을 널이 될 수 없는 타입의 파라미터를 받는 함수에 전달할 수 없다.
    //Type mismatch: inferred type is String? but String was expected
    //strLen(x)
}