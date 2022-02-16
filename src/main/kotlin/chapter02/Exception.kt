package chapter02

import java.io.BufferedReader
import java.io.StringReader
import java.lang.NumberFormatException
import java.nio.Buffer

class Exception {

}

fun main(args:Array<String>){
    val number = 10;

    val percentage =
        if(number in 0..100)
            number
        else
            throw IllegalArgumentException(//throw는 식이다
                "A percentage value must be between 0 and 100 : $number"
            )

    if(percentage !in 0..100){
        throw IllegalArgumentException(//throw는 식이다
            "A percentage value must be between 0 and 100 : $percentage"
        )
    }

    //자바와 마찬가지로 try 사용하기
    fun readNumber(reader:BufferedReader): Int ? {//함수가 던질 수 있는 예외를 명시할 필요가 없다
        try{
            val line = reader.readLine();
            return Integer.parseInt(line)

        }
        catch(e:NumberFormatException) {
            return null // 예외 타입을 :의 오른쪽에 쓴다.
        }
        finally {
            reader.close() // "finally"는 자바와 똑같이 작동한다.
        }
    }

    val reader= BufferedReader(StringReader("239"))
    println(readNumber(reader)) // 239

    //try를 식으로 사용
    fun readNumber_(reader:BufferedReader) {//함수가 던질 수 있는 예외를 명시할 필요가 없다
        val number = try{
            Integer.parseInt(reader.readLine())//이 식의 값이 "try" 식의 값이 된다.
        }
        catch(e:NumberFormatException) {
            return
        }
        println(number)
    }

    val reader_= BufferedReader(StringReader("not a number"))
    readNumber_(reader_)// 아무것도 출력되지 않는다.

    //catch에서 값 반환하기
    fun readNumber__(reader:BufferedReader) {//함수가 던질 수 있는 예외를 명시할 필요가 없다
        val number = try{
            Integer.parseInt(reader.readLine())//예외가 발생하지 않으면 이 값을 사용한다.
        }
        catch(e:NumberFormatException) {
            null //예외가 발생하면 null 값을 사용한다.
        }
        println(number)
    }

    val reader__= BufferedReader(StringReader("not a number"))
    readNumber__(reader__)//예외가 발생했으므로 함수가 "null"을 출력한다.
}