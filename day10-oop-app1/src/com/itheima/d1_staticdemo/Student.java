package com.itheima.d1_staticdemo;

/*
*   类变量; 有static修饰,属于类,在计算机里只有一份,会被类的全部对象共享
*       - 类名.类变量(推荐)
*   实例变量(对象的变量); 无static, 属于每个对象的
* */
public class Student {
    // 类变量
     static String name;
//    String name;
    // 实例变量（对象的变量）
    int age;
}
