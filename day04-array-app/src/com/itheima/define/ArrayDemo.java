package com.itheima.define;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);

        int[] arr = {11, 22, 33};
        // 默认会打印出该数组对象在内存中的引用地址
        System.out.println(arr);
        System.out.println("数组是:" + Arrays.toString(arr));
        System.out.println(arr[1]);

        // 可以直接修改里面的相关内容
        arr[0] = 44;
        arr[1] = 55;
        arr[2] = 66;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
