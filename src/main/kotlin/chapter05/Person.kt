package chapter05

import java.awt.Button

data class Person(val name : String, val age : Int)

fun printMessagesWithPrefix(messages:Collection<String>, prefix:String){
    messages.forEach{ //각 원소에 대해 수행할 작업을 람다로 받는다.
        println("$prefix $it")//람다 안에서 함수의 "prefix" 파라미터를 받는다.
    }
}

fun printProblemCounts(responses:Collection<String>){
    //람다에서 사용할 변수를 정의
    var clientErrors = 0
    var serverErrors = 0

    responses.forEach{
        if(it.startsWith("4")){
            clientErrors++  //람다 안에서 람다 밖의 변수를 변경한다.
        }else if(it.startsWith("5")){
            serverErrors++  //람다 안에서 람다 밖의 변수를 변경한다.
        }
    }
    println("$clientErrors client errors, $serverErrors serer errors")
}

fun salute() = println("Salute!!")



fun sendEmail(person: Person, message: String) = println("Email")

fun main() {

    val a = Person("Dmitry", 34)
    val personsAgeFunction = Person::age
    println(personsAgeFunction(a))//34

    val dmitryAgeFunction = a::age //바운드 멤버 참조
    println(dmitryAgeFunction())//34

    fun Person.isAdult() = age >= 21
    val predicate = Person::isAdult

    val createPerson = ::Person // "Person"의 인스턴스를 만드는 동작을 값으로 저장한다.
    val p = createPerson("Alice", 29)
    println(p)//Person(name=Alice, age=29)


    val action = {person : Person, message : String -> // 이 람다는 sendEmail 함수에게 작업을 위임한다.
        sendEmail(person, message)
    }

    val nextAction = ::sendEmail //람다 대신 멤버 참조를 쓸 수 있다.

    run(::salute)//Salute!!


    val getAge2 = Person::age

    val responses = listOf("200 OK", "418 I'm a teapot", "500 Internal Server Error")
    printProblemCounts(responses) //1 client errors, 1 serer errors

    val errors = listOf("403 Forbidden", "404 Not Found")
    printMessagesWithPrefix(errors, "Error : ")
    /*
    Error :  403 Forbidden
    Error :  404 Not Found
    */


    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    println(people.maxByOrNull { it.age })//나이 프로퍼티를 비교해서 값이 가장 큰 원소 찾기
    //Person(name=Bob, age=31)

    people.maxByOrNull ({ p:Person -> p.age })
    people.maxByOrNull() {p:Person -> p.age}
    people.maxByOrNull { p:Person -> p.age }
    people.maxByOrNull { p -> p.age }
    people.maxByOrNull { it.age }

    people.maxByOrNull(Person::age)


    val getAge = {p : Person -> p.age}
    people.maxByOrNull(getAge)

    val sum = {x:Int, y:Int -> x+y}
    println(sum(1,2))//3  --- 변수에 저장된 람다를 호출한다.

    val sum2 = { x:Int, y:Int ->
        println("Computing the sum of $x and $y...")
        x+y
    }

    println(sum2(1,2))
   /* Computing the sum of 1 and 2...
    3*/

    run{ println(42)}//42


    val people2 = listOf(Person("이몽룡", 29), Person("성춘향", 31))
    val names = people2.joinToString(separator=" ", transform={p:Person -> p.name})
    println(names) //이몽룡 성춘향

    val names2 = people2.joinToString(" ") {  p:Person -> p.name  }
    println(names2)//이몽룡 성춘향
}
