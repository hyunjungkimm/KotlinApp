package chapter06.chapter06_03

import java.io.BufferedReader
import java.io.StringReader

class Coll {

}
//널이 될 수 있는 값으로 이뤄진 컬렉션 만들기
fun readNumbers(reader: BufferedReader):List<Int?>{
    val result = ArrayList<Int?>() // 널이 될 수 있는 Int 값으로 이뤄진 리스트를 만든다
    for(line in reader.lineSequence()){
        try{
            val number = line.toInt()
            result.add(number)//정수(널이 아닌 값)을 리스트에 추가한다.
        }catch (e:NumberFormatException){
            result.add(null) //현재 줄을 파싱할 수 없으로 리스트에 널을 추가한다.
        }
    }
    return result
}

//널이 될 수 있는 값으로 이뤄진 컬렉션 다루기
fun addValidNumbers(numbers:List<Int?>){
    var sumOfValidNumbers = 0
    var invalidNumbers = 0
    for(number in numbers) { //리스트에서 널이 될 수 있는 값을 읽는다.
        if (number != null){//널에 대한 값을 확인한다.
            sumOfValidNumbers += number
        }else{
            invalidNumbers++
        }
    }
    println("Sum of valid numbers:$sumOfValidNumbers")
    println("Invalid numbers:$invalidNumbers")
}


//filterNotNull를 널이 될 수 있는 값으로 이뤄진 컬렉션에 대해 사용하기
fun addValidNumbers2(numbers:List<Int?>){
    val validNumbers = numbers.filterNotNull()
    println("Sum of valid numbers : ${validNumbers.sum()}")
    println("Invalid numbers:${numbers.size - validNumbers.size}")
}

//읽기 전용과 변경 가능한 컬렉션 인터페이스
fun<T> copyElements(source:Collection<T>, target:MutableCollection<T>) {
    for(item in source){//source 컬렉션의 모든 원소에 대해 루프를 돈다.
        target.add(item) //변경 가능한 target 컬렉션에 원소를 추가한다.
    }
}


fun main() {
  /*  val reader = BufferedReader(StringReader("1\nabc\n42"))
    val numbers = readNumbers(reader)
    addValidNumbers2(numbers)*/

    val source: Collection<Int> = arrayListOf(3,5,7)
    val target: MutableCollection<Int> = arrayListOf(1)
    copyElements(source, target)
    println(target) //[1,3,5,7]
}