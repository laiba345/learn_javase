package com.itheima.d2_static_method;

public class Student {
    double score;
    // 类方法; 有static修饰的成员方法,属于类;
    // 推荐使用: 类名.类方法
    public static void printHelloWorld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    // 实例方法（对象的方法）; 只能用 对象.实例方法
    // 实例方法; 只能使用对象来访问;
    public void printPass(){
        System.out.println("成绩：" +
                (score >= 60 ? "及格": "不及格"));
    }
}
