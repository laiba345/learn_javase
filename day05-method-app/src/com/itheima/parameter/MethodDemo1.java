package com.itheima.parameter;

public class MethodDemo1 {
    /*
    *   java的参数传递机制; 值传递
    *   - 指的是在传递实参给方法的形参的时候,传递的是实参变量中存储的值的副本
    *   - 实参: 方法内部定义的变量
    *   - 形参: 定义方法时中的参数
    * */
    public static void main(String[] args) {
        // 目标：理解方法的参数传递机制：值传递。
        int a = 10;
        change(a); // change(10);
        System.out.println("main:" + a); // 10
    }

    public static void change(int a){
        System.out.println("change1:" + a); // 10
        a = 20;
        System.out.println("change2:" + a); // 20
    }
}
