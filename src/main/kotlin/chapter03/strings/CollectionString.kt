package chapter03.strings

class CollectionString {

}

fun main(args:Array<String>){
    println("12.345-6.A".split("\\.|-".toRegex()))//정규식을 명시적으로 만든다
    //[12, 345, 6, A]

    println("12.345-6.A".split(".","-"))//여러 구분 문자열을 지정한다.
    //[12, 345, 6, A]

    println("12.345-6.A".split('.','-'))//문자열 대신 문자도 가능
    //[12, 345, 6, A]

    parsePath("/Users/yole/kotlin-book/chapter.adoc")
    //Dir:/Users/yole/kotlin-book, name:chapter, ext:adoc

    val kotlinLogo = """|  //
                       .| //
                       .|/ \"""

    println(kotlinLogo.trimMargin("."))
    /*
    |  //
    | //
    |/ \
     */

    val price="""${'$'}99.9"""
}
//String 확장 함수를 사용해 경로 파싱하기
fun parsePath(path:String){
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")

    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")

    println("Dir:$directory, name:$fileName, ext:$extension")
}

//경로 파싱에 정규식 사용하기
fun parsePath2(path:String) {
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)
    if(matchResult != null){
        val(directory, fileName,extension) = matchResult.destructured
        println("Dir: $directory, name:$fileName, ext:$extension")
    }
}

