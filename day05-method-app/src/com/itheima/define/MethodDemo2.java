package com.itheima.define;

public class MethodDemo2 {
    public static void main(String[] args) {
        // 目标：掌握按照方法解决的实际业务需求不同，设计出合理的方法形式来解决问题。
        // 需求：打印多行Hello World.
        // 调用函数,传入相关的参数的操作
        // 在主函数中调用相关方法;
        printHelloWorld(3);

        System.out.println("---------------");

        printHelloWorld(6);


    }

    /**
       有参数，无返回值的方法
     */
    public static void printHelloWorld(int n){
        for (int i = 1; i <= n; i++) {
            System.out.println("Hello World");
        }
    }
}
