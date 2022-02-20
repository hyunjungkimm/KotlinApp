package chapter03

class User3(val id:Int, val name:String, val address: String)

fun saveUser(user:User3) {
    fun validate(value:String, fieldName:String){//이제 saveUser 함수의 user 파라미터를 중복 사용하지 않는다.
        if(value.isEmpty()){//필드 검증이 중복된다.
            throw IllegalArgumentException(
                "Can't save user ${user.id} : empty $fieldName")
        }
    }

    validate(user.name, "Name")
    validate(user.address, "Address")

    //user를 데이터베이스에 저장한다.
}