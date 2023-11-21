package com.itheima.constructor;

/*
*   开发一个个对象,把数据交给对象,再调用对象的方法来完成对数据的处理
*   万物皆是对象
*   1. 面向对象的好处
*       - 符合人类思维习惯、编程更简单,更直接
*   对象的本质上是一种特殊的数据结构; 类似于现实生活中的一张表
*   2. 对象是啥?如何得到?
*       - 对象就是一种特殊的数据结构,类似于现实生活中的一张表
*       - 对象是用类new出来的,有了类就可以创建出对象
*           - 变量; 用来说明对象可以处理什么数据
*           - 方法; 描述对象有什么功能,也就是对数据进行什么样的处理
*   3. 面向对象编程这种套路是怎么回事?
*       - 祖师爷认为万物皆对象,谁的数据谁处理
*           - 学生数据、汽车数据
* */
public class Student {
    String name; // 名字
    double score; // 分数
    // 无参数构造器
    public Student(){
        System.out.println("无参数构造器被触发执行了~");
    }

    // 有参数构造器
    public Student(String name, double score){
        System.out.println("有参数构造器被触发执行了~~");
        this.name = name;
        this.score = score;
    }
}
