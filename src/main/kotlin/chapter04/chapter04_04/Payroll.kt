package chapter04.chapter04_04

import chapter02.Person
import java.io.File

object Payroll {
    val allEmployees = arrayListOf<Person>()
    fun calculateSalary(){
        for(person in allEmployees){

        }
    }
}

object CaseInsensitiveFileComparator : Comparator<File> {
    override fun compare(file1: File, file2: File): Int {
        return file1.path.compareTo(file2.path, ignoreCase = true)
    }
}

fun main() {
    Payroll.calculateSalary()

    println(CaseInsensitiveFileComparator.compare(File("/User"), File("/user"))) //0

    val files = listOf(File("/z"), File("/a"))
    println(files.sortedWith(CaseInsensitiveFileComparator))//[\a, \z]
}

