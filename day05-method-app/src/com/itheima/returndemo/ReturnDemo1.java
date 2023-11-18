package com.itheima.returndemo;

public class ReturnDemo1 {
    /*
    *   return关键字在方法中单独使用
    *       - 跳出并立即结束当前方法的执行。
    *
    *   return; 跳出并立即结束所在方法的执行
    *   break; 跳出并结束当前所在循环的执行
    *   continue; 结束当前所在循环的当次继续, 进入下一次执行
    * */
    public static void main(String[] args) {
        // 目标：掌握return单独使用：return; 在无返回值方法中的作用：跳出并立即结束当前方法的执行。
        System.out.println("程序开始。。。");
        chu(10, 0);
        System.out.println("程序结束。。。");
    }

    public static void chu(int a, int b){
        if(b == 0){
            System.out.println("您的数据有问题，不能除0~~");
            return; // 跳出并结束当前方法的执行。
        }
        int c = a / b;
        System.out.println("除法结果是：" + c);
    }
}
