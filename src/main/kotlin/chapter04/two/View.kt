package chapter04.two

import java.util.jar.Attributes
import javax.naming.Context
import javax.print.attribute.AttributeSet

open class View {
    constructor(ctx:Context){//부 생성자

    }
    constructor(ctx: Context, attr:AttributeSet){//부 생성자

    }
}
/*

class MyButton : View{

    //상위 클래스의 생성자를 호출한다.
    constructor(ctx: Context) :this(ctx, MY_STYLE){

    }
    constructor(ctx: Context, attr: AttributeSet) :super(ctx,attr){

    }
}
*/
