package com.itheima.parameter;

public class MethodTest3 {
    public static void main(String[] args) {
        // 目标：完成打印int类型的数组内容。
        int[] arr = {10, 30, 50, 70};
        printArray(arr);

        int[] arr2 = null;
        printArray(arr2);

        int[] arr3 = {};
        printArray(arr3); // 这个才表示的是空数组,表示[]
    }
    // 接收一个参数数组很关键; int[] arr的形式
    public static void printArray(int[] arr){
        // 判断数组是否为空地址
        if(arr == null){
            System.out.println(arr); // null
            return; // 跳出当前方法
        }

        System.out.print("[");
        // 直接遍历接到的数组元素
        for (int i = 0; i < arr.length; i++) {
//            if(i == arr.length - 1){
//                System.out.print(arr[i]);
//            }else {
//                System.out.print(arr[i] + ", ");
//            }
            // 使用三元运算符来进行相关的操作,效果是一样的,优雅专业的程序员
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ", ");
        }
        System.out.println("]");
    }
}
