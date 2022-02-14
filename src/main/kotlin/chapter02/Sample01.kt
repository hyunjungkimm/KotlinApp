package chapter02

fun main(args:Array<String>) {
    println("Hello, World!")
}

fun max(a:Int, b:Int) :Int {
    return if(a > b) a else b
}

fun max1(a:Int, b:Int):Int = if(a>b) a else b

fun max2(a:Int, b:Int) = if(a>b) a else b

class Sample01 {

}