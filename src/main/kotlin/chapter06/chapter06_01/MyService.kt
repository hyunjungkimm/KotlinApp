package chapter06

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class MyService {
    fun performAction(): String = "foo"

}

class MyTest {
    private lateinit var myService : MyService // 초기화하지 않고 널이 될 수 없는 프로퍼티를 선언한다.
    @Before
    fun setUp(){
        myService = MyService()// 예제 6.10과 마찬가지로 setUp 메소드에서 프로퍼티를 초기화한다.
    }
    @Test
    fun testAction(){
        Assert.assertEquals("foo", myService.performAction()) // 널 검사를 수행하지 않고 프로퍼티를 사용한다.
    }
}

