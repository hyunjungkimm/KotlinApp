package chapter03

class User(val id:Int, val name:String, val address: String)

fun saveUser(user:User) {
    if(user.name.isEmpty()){//필드 검증이 중복된다.
        throw IllegalArgumentException(
            "Can't save user ${user.id} : empty Name")
    }

    if(user.address.isEmpty()){//필드 검증이 중복된다.
        throw IllegalArgumentException(
            "Can't save user ${user.id} : empty Address")
    }

    //user를 데이터베이스에 저장한다.
}

fun main(args:Array<String>){
    saveUser(User(1, "",""))
    //java.lang.IllegalArgumentException: Can't save user 1 : empty Name
}