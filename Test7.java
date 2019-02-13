package com;

/**
 * Author:Fanleilei
 * Created:2019/2/13 0013
 */
public class Test7 {

    public static void show(AA a){

        System.out.println(a.getInfo());

    }

    public static void main(String[] args) {

        //对象的向上转型有一个最为核心的用途：操作参数统一
        AA a=new AA();
        show(a);
        AA a1=new A1();
        show(a1);

        show(new A2());
        show(new A3());
    }
}
class AA{

    String getInfo(){

        return "A";
    }
}
class A1 extends AA {

    String getInfo(){

        return "A1";
    }
}
class A2 extends AA {

    String getInfo(){

        return "A2";
    }
}
class A3 extends AA {

    String getInfo(){

        return "A3";
    }
}
