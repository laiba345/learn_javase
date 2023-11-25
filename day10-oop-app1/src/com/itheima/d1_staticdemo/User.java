package com.itheima.d1_staticdemo;

public class User {
    /*
    *   类变量的应用场景:
    *   - 在开发中,如果某个数据只需要一份,且希望能够被共享(访问、修改),则该数据可以定义成类变量来记住
    * */
    // 类变量; 一般使用public来修饰,代表对外完全是公开且暴露的
    public static int number;

    // 一旦别人通过用户类来创建对象,就会调用构造器;
    public User(){
        // User.number++;
        // 注意：在同一个类中，访问自己类的类变量，才可以省略类名不写。
        // 在同一个类中,访问自己类的类变量, 才可以省略类名不写
        number++;
    }
}
