package chapter03

class User2(val id:Int, val name:String, val address: String)

fun saveUser(user:User2) {
    fun validate(user:User2,//한 필드를 검증하는 로컬 함수를 정의한다.
                 value:String,
                 fieldName:String){
        if(value.isEmpty()){
            throw IllegalArgumentException(
                "Can't save user ${user.id} : empty $fieldName")
        }
    }
    //로컬 함수를 호출해서 각 필드를 검증한다.
    validate(user,user.name, "Name")
    validate(user,user.address, "Address")

    //user를 데이터베이스에 저장한다.
}