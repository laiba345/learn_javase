package com.itheima.memory;

public class ArrayDemo2 {
    public static void main(String[] args) {
        // 目标：认识多个变量指向同一个数组对象的形式，并掌握其注意事项。
        int[] arr1 = {11, 22, 33};

        // 把int类型的数组变量arr1赋值给int类型的数组变量arr2
        int[] arr2 = arr1;

        System.out.println(arr1);
        System.out.println(arr2);

        int a = 1;
        int b = 2;

        /*
        *  ==; 用于比较两个对象引用,(对象内存地址); 检查它们是否指向内存中的相同对象
        *  ===; java中并没有该类表达式; java中比较基本数据类型,使用的是 .equals() 方法
        * */
        System.out.println(arr1 == arr2); // true

        arr2[1] = 99;
        System.out.println(arr1[1]);

        arr2 = null; // 拿到的数组变量中存储的值是null
        System.out.println(arr2);

//        System.out.println(arr2[0]);
//        System.out.println(arr2.length);
    }
}
