package com.itheima.overload;

public class MethodOverLoadDemo1 {
    /*
    *   方法重载;
    *       - 一个类中,出现多个方法的名称相同,但是它们的形参列表不同,那么这些方法就是重载了
    *       - 一个类中,只要一些方法的名称相同、形参列表不同,那么它们就是方法重载了,其他的不管
    *       - 形参列表不同指的是:形参的个数、类型、顺序不同,不关心形参的名称
    * */
    public static void main(String[] args) {
        // 目标：认识方法重载，并掌握其应用场景。
        test();
        test(100);
    }
    //
    public static void test(){
        System.out.println("===test1===");
    }

    public static void test(int a){
        System.out.println("===test2===" + a);
    }

    void test(double a){

    }

    void test(double a, int b){
    }

    void test(int b, double a){
    }

    int test(int a, int b){
        return a + b;
    }
}
