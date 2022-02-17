package chapter03.strings

fun <T> joinToString2(
    collection : Collection<T>,
    separator : String = ", ",//디폴트 값이 지정된 파라미터들
    prefix : String = "", //디폴트 값이 지정된 파라미터들
    postfix : String = "" //디폴트 값이 지정된 파라미터들
) : String {
    val result = StringBuilder(prefix)
    for((index, element) in collection.withIndex()){
        if(index > 0) result.append(separator) //첫 원소 앞에는 구분자를 붙이면 안된다.
        result.append(element);
    }
    result.append(postfix)
    return result.toString()
}


class join {

}