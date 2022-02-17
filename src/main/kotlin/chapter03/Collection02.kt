package chapter03

import chapter03.strings.joinToString2

class Collection02 {

}

fun main(args:Array<String>){
    val list = listOf(1,2,3)
    println(list)// toString() 호출 -  [1, 2, 3]
    println(joinToString(list, "; ", "(", ")"))//(1; 2; 3)

    //자바
    println(joinToString(list, /*separator*/" ", /*prefix*/" ", /*postfix*/"."))
    //코틀린
    println(joinToString(list, separator = " ", prefix =" ", postfix= "."))

    println(joinToString2(list, ", ", "", ""))
    println(joinToString2(list))//separator, prefix, postfix 생략
    println(joinToString2(list, ";")) // separtor를 ";"로 지정, prefix와 postfix 생략

}

fun <T> joinToString(
    collection: Collection<T>,
    separator : String,
    prefix : String,
    postfix : String
) : String {
    val result = StringBuilder(prefix)
    for((index, element) in collection.withIndex()){
        if(index > 0) result.append(separator) //첫 원소 앞에는 구분자를 붙이면 안된다.
        result.append(element);
    }
    result.append(postfix)
    return result.toString()
}
