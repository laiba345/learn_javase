package com.itheima.define;

public class MethodTest4 {
    // 方法申明了具体的返回值类型, 内部必须使用return返回对应类型的数据
    // 形参列表可以有多个, 甚至可以没有, 如果有多个形参, 需要用逗号隔开
    public static void main(String[] args) {
        // 目标：掌握设计方法的技巧。
        // 可以使用某个元素来承接
        int rs = add(5);
        System.out.println("1-5的和是：" + rs);

        int rs2 = add(100);
        System.out.println("1-100的和是：" + rs2);

        System.out.println("-----------------------------------");

        judge(10);
        judge(7);
    }
    // 某个方法中, 方法中的参数需要用int来参加
    public static void judge(int number){
        if(number % 2 == 0){
            System.out.println(number + "是一个偶数！");
        }else {
            System.out.println(number + "是一个奇数！");
        }
    }

    public static int add(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            // i = 1 2 3 ... n
            sum += i;
        }
        return sum;
    }
}
