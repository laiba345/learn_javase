package com.itheima.d1_staticdemo;


/*
*   设计模式: 单例设计模式
*       - 解决问题的一种方案
*       - 让类对外只能产生一个对象; 如任务管理器对象;
* */
public class Test {
    public static void main(String[] args) {
        // 目标：掌握有无static修饰成员变量的用法，特点。
        // 1、类变量的用法。
        // 类名.类变量（推荐）
        Student.name = "袁华";

        // 对象.类变量（不推荐）
        Student s1 = new Student();
        s1.name = "马冬梅";

        System.out.println(s1.name);

        Student s2 = new Student(); // 因为指向的是同一个
        s2.name = "秋雅";

        System.out.println(s1.name); // 秋雅
        System.out.println(s2.name); // 秋雅
        System.out.println(Student.name); // 秋雅

        // 2、实例变量的用法：属于每个对象的变量
        // 对象.实例变量
        s1.age = 23;
        s2.age = 18;
        System.out.println(s1.age); // 23
        System.out.println(s2.age);

        // 报错; 不清楚是第一个还是第二个;
        // System.out.println(Student.age); // 报错  实例变量只能通过对象来进行访问操作

    }
}
