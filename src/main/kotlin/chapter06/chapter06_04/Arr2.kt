package chapter06.chapter06_04

class Arr2 {
}

fun main(args:Array<String>) {
    args.forEachIndexed { index, element ->
        println("Argument $index is : $element")
    }
}