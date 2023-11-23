package com.itheima.string;

public class StringDemo1 {
    /*
    *   1. String是什么? 可以做什么?
    *       - 代表字符串, 可以用来创建对象封装字符串的数据,并对其进行处理
    *   2. String类创建对象封装字符串数据的方式有几种?
    *       - 直接使用双引号 ""
    *       - 使用new String类,调用构造器初始化字符串对象
    * */
    public static void main(String[] args) {
        // 目标：掌握创建String对象，并封装要处理的字符串的两种方式。
        // 1、直接双引号得到字符串对象，封装字符串数据
        String name = "黑马666";
        System.out.println(name);

        // 2、new String创建字符串对象，并调用构造器初始化字符串
        String rs1 = new String();
        System.out.println(rs1); // ""   不是很建议

        String rs2 = new String("itheima");
        System.out.println(rs2);

        // 创建一个char字符数组,然后可以直接转换为字符串
        char[] chars = {'a', '黑', '马'};
        String rs3 = new String(chars);
        System.out.println(rs3);

        byte[] bytes = {97, 98, 99};
        String rs4 = new String(bytes);
        System.out.println(rs4);
    }
}


