package com.itheima.constructor;

public class Test {
    /*
    *   对象在计算机中的执行原理是怎么回事?
    *       - Student s1 = new Student();
    *       - 每次new Student(),就是在堆内存中开辟一块内存区域代表一个学生对象
    *       - s1变量里面记住的是学生对象的地址
    *   如何识别引用类型的变量
    *       - Student s1 = new Student();
    *       - s1变量中存储的是对象的地址,因此变量s1也称为引用类型的变量
    * */
    public static void main(String[] args) {
        // 目标：认识构造器，并掌握构造器的特点、应用场景、注意事项。
        // 创建一个学生对象, 封装波妞的数据
        Student s = new Student("播仔", 99);

        Student s1 = new Student();
//        System.out.println("s1是"+ s1);
        s1.name = "播妞";
        s1.score = 100;

        Student s2 = new Student("小黑", 59);
        System.out.println(s2.name);
        System.out.println(s2.score);

        Teacher t = new Teacher();
    }
}
