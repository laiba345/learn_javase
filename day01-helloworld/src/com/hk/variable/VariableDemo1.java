package com.hk.variable;

/**
 * @author Fcun
 * @data 2023/11/15 --- 10:17
 */
public class VariableDemo1 {
    public static void main(String[] args) {
        // 1. 定义一个整型变量来记住一个整数
        int age = 24;
        System.out.println(age);
        // 2. 记住一个人的成绩
        double score = 99;
        System.out.println(score);

        System.out.println("--------------------------");

        /*
        *   变量的原理：变量就是内存中的一块区域，可以理解成一个盒子，用来装数据
        *   int age = 18;
        *
        *   变量有啥特点
        *   1. 里面装的数据可以被替换
        *
        *   变量的应用场景； 变量里装的数据可以被替换
        *   1. 微信钱包
        *   2. 公交车上下车人数
        * */

        // 3. 使用变量的好处: 便于扩展和维护
        int number = 888;
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);

        // 1. 里面装的数据可以被替换
        int age2 = 19;
        age2 = 20;
        System.out.println(age2);

        System.out.println("------------------------------------");
        // 应用场景：微信钱包；钱包有9.5元，收到了10元红包，又发出去5元红包，请输出各阶段钱包情况
        double money = 9.5;
        System.out.println(money);

        money += 10;
        System.out.println(money);

        money -= 5;
        System.out.println(money);
    }
}
