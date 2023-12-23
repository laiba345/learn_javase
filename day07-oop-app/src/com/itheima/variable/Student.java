package com.itheima.variable;

public class Student {
    // 成员变量（对象的属性，Field）
    String name;
    double score;

    public void aaa(){
        double score = 98;
        System.out.println(score); // 就近原则,使用的就是上方的
        // 使用类中的变量, 需要使用this关键字;
        System.out.println(this.score); // 想要使用类里面的,需要使用this关键字来获取
    }
}
