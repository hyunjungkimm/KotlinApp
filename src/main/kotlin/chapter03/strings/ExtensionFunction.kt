package chapter03.strings

//문자열의 마지막 문자를 돌려주는 메소드
fun String.lastChar() : Char = this.get(this.length -1)

fun String.lastChar2() : Char = get(length -1)
//joinToString()를 확장으로 정의하기
fun <T> Collection<T>.joinToString( //Collection<T>에 대한 확장 함수를 선언한다.
    separator : String = ", ",//디폴트 값이 지정된 파라미터들
    prefix : String = "", //디폴트 값이 지정된 파라미터들
    postfix : String = "" //디폴트 값이 지정된 파라미터들
) : String {
    val result = StringBuilder(prefix)
    for((index, element) in this.withIndex()){//"this"는 수신 객체를 가리킨다. 여기서는 T 타입의 원소로 이루어진 컬렉션이다.
        if(index > 0) result.append(separator)
        result.append(element);
    }
    result.append(postfix)
    return result.toString()
}

fun Collection<String>.join(
    separator : String = ", ",//디폴트 값이 지정된 파라미터들
    prefix : String = "", //디폴트 값이 지정된 파라미터들
    postfix : String = "" //디폴트 값이 지정된 파라미터들
) = joinToString(separator, prefix, postfix)


fun main(args:Array<String>){
    println("Kotlin".lastChar())
    //n

    println("Kotlin".lastChar2())
    //n

    val list = listOf(1,2,3)
    println(list.joinToString(separator ="; ",prefix="(", postfix = ")"))
    //(1; 2; 3)

    println(list.joinToString(" ")) // 1 2 3

    println(listOf("one", "two", "eight").join(" "))//one two eight

    //println(listOf(1, 2, 8).join())
}




class ExtensionFunction {

}