package chapter04.chapter04_02

class USer5(val name:String) {
    var address : String = "unspecified"
    set(value:String){
        println("""
            Attress was changed for $name:
            "$field" -> "$value".""".trimIndent())//뒷받침하는 필드값 일긱
        field = value //뒷받침하는 필드값 변경하기
    }
}