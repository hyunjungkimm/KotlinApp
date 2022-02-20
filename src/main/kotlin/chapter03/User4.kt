package chapter03

class User4(val id:Int, val name:String, val address: String)

fun User4.validateBeforeSave() {
    fun validate(value:String, fieldName:String){
        if(value.isEmpty()){//필드 검증이 중복된다.
            throw IllegalArgumentException(
                "Can't save user $id : empty $fieldName")// User의 프로퍼티를 직접 사용할 수 있다.
        }
    }

    validate(name, "Name")
    validate(address, "Address")

}

fun saveUser(user:User4){
    user.validateBeforeSave() // 확장 함수를 호출한다.

    //user를 데이터베이스에 저장한다.
}