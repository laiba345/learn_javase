package com.itheima.parameter;

public class MethodDemo2 {
    /*
    *    new出来的内容一般都是放在堆内存当中的
    *    引用类型的参数传递
    *       - 都是值传递
    *       - 基本类型的参数传递存储的数据值
    *       - 引用类型的参数传输存储的地址值
    * */
    public static void main(String[] args) {
        // 目标：理解引用类型的参数传递机制：值传递的。
        int[] arrs = new int[]{10, 20, 30};
        change(arrs);
        System.out.println("main:" + arrs[1]);
    }

    public static void change(int[] arrs){
        System.out.println("方法内1：" + arrs[1]);
        arrs[1] = 222;
        System.out.println("方法内2：" + arrs[1]);
    }
}
