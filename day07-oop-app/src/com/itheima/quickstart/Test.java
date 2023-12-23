package com.itheima.quickstart;

public class Test {
    public static void main(String[] args) {
        // 目标：面向对象编程快速入门。
        // 1、创建一个学生对象，封装播妞的数据
        Student s1 = new Student();
        s1.name = "播妞";
//        System.out.println(s1.name);
        s1.chinese = 100;
        s1.math = 100;
        s1.printTotalScore();
        s1.printAverageScore();

        // 2、再创建一个学生对象，封装播仔的数据
        Student s2 = new Student();
        s2.name = "播仔";
        s2.chinese = 59;
        s2.math = 100;
        s2.printTotalScore();
        s2.printAverageScore();
        /*
        *   当堆内存中的对象,没有被任何变量引用(指向)时,就会被判定为内存中的“垃圾”
        *   Java存在自动垃圾回收机制,会自动清除垃圾对象,程序员不用操心
        * */
//        s1 = null;
//        s2 = null;
        System.out.println(s1);
        System.out.println(s2);
    }
}
