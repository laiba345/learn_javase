package com.itheima.d2_recursion;

/**
 * 目标：认识一下递归的形式。
 */
public class RecursionTest1 {
    public static void main(String[] args) {
        test1();
    }

    // 直接方法递归
    /*
    *   递归: 核心思想: 将问题分解为更小、更简单的相似子问题来解决;
    *   --- 这种方法通常涉及函数调用自身的过程,直到问题减小到可以直接解决的程度为止;
    * */
    public static void test1(){
        System.out.println("----test1---");
        test1(); // 直接方法递归
    }

    // 间接方法递归
    public static void test2(){
        System.out.println("---test2---");
        test3();
    }

    public static void test3(){
        test2(); // 间接递归
    }
}
