package com.itheima.define;

public class MethodDemo1 {
    /*
    *   使用方法的好处:
    *       1. 提高了代码的复用性;
    *       2. 让程序的逻辑更加清晰;
    *   什么是方法?
    *       - 方法是一种语法结构,可以将一段代码封装成一个功能,以便于重复调用
    *
    *   方法在计算机中的执行原理
    *       - 栈; 先进后出;
    *           - 保证一个方法调用另一方法以后, 可以回来
    *       - 执行结束以后, 会弹出栈;
    * */
    public static void main(String[] args) {
        // 目标：掌握定义方法的完整格式，搞清楚使用方法的好处。
        // 需求：假如现在很多程序员都要进行2个整数求和的操作
        // 1、李工。
        int rs = sum(10, 20);
        System.out.println("和是：" + rs);

        // 2、张工。
        int rs2 = sum(30, 20);
        System.out.println("和是：" + rs2);
    }
    // 方法是一种语法结构,其可以把一段代码封装成一个功能,以便重复调用
    // 有返回值的相关操作
    // 如果有返回值需要申明返回值的类型;
    public static int sum(int a,int b) {
        int c = a + b;
        return c;
    }
}
