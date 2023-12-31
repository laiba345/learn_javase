package com.itheima.d13_stringBuilder;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int[] arr = new int[]{11, 22, 33};
        System.out.println(arr.toString()); // [I@2a84aee7
        System.out.println(Arrays.toString(arr)); // [11, 22, 33]
        // 目标：完成遍历数组内容，并拼接成指定格式的案例。
        System.out.println(getArrayData(new int[]{11, 22, 33}));
    }

    public static String getArrayData(int[] arr){
        // 1、判断arr是否为null
        if(arr == null){
            return null;
        }

        // 2、arr数组对象存在。 arr = [11, 22, 33]
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1){
                sb.append(arr[i]);
            }else {
                sb.append(arr[i]).append(", ");
            }
        }
        sb.append("]");

        return sb.toString();
    }
}
