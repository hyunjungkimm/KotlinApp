package chapter04.two

import java.util.jar.Attributes
import javax.naming.Context

open class View {
    constructor(ctx:Context){//부 생성자

    }
    constructor(ctx: Context, attr:Attributes){//부 생성자

    }
}
/*
class MyButton : View{
    //상위 클래스의 생성자를 호출한다.
    constructor(ctx: Context) :this(ctx, MY_STYLE){

    }
    constructor(ctx: Context, attr: Attributes) :super(ctx,attr){

    }
}
 */