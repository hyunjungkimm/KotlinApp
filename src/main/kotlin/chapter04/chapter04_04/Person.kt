package chapter04.chapter04_04

data class Person(val name : String) {
    object NameComparator : Comparator<Person> {
        override fun compare(p1 :Person, p2: Person) : Int =
            p1.name.compareTo(p2.name)
    }
}


class A {
    companion object {
        fun bar(){
            println("Companion object called")
        }
    }
}

class User private constructor(val nickname : String){ // 주 생성자를 비공개로 만든다.
    companion object{ //동반 객체를 선언한다.
        fun newSubscribingUser(email:String) =
            User(email.substringBefore('@'))
        /*fun newFacebookUser(accountId:Int) = //페이스북 사용자 Id로 사용자를 만드는 팩토리 메소드
            User(getFacebookName(accountId))*/
    }
}


fun main() {
    val persons = listOf(Person("Bob"), Person("Alice"))
    println(persons.sortedWith(Person.NameComparator)) //[Person(name=Alice), Person(name=Bob)]

    A.bar() //Companion object called

    val subscribingUser = User.newSubscribingUser("bob@gmail.com")
   // val facebookUser = User.newFacebookUser(4)
    println(subscribingUser.nickname)//bob

}
