package com.itheima.string;

import java.util.Scanner;

/**
   目标：完成用户的登录案例。
 */
public class StringTest4 {
    /*
    *   字符串的比较
    *       - 基本数据类型的变量或者值应该使用 == 来比较
    *       - 开发中比较字符串推荐使用equals方法,它只关心字符串内容一样就返回true
    * */
    public static void main(String[] args) {
            // 1、开发一个登录界面
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请您输入登录名称：");
            String loginName = sc.next();
            System.out.println("请您输入登录密码：");
            String passWord = sc.next();

            // 5、开始调用登录方法，判断是否登录成功
            boolean rs = login(loginName, passWord);
            if(rs){
                System.out.println("恭喜您，欢迎进入系统~~");
                break; // 跳出for循环，代表登录完成
            }else {
                System.out.println("登录名或者密码错误，请您确认~~");
            }
        }
    }

    /**
      2、开发一个登录方法，接收用户的登录名和密码，返回认证的结果
      这里给定了相应的内容操作,这一点很关键就是如此;
     */
    public static boolean login(String loginName, String passWord){
        // 3、准备一份系统正确的登录名和密码
        String okLoginName = "itheima";
        String okPassWord = "123456";

        // 4、开始正式判断用户是否登录成功
        /*if(okLoginName.equals(loginName) && okPassWord.equals(passWord)){
            // 登录成功的
            return true;
        }else {
            return false;
        }*/
        // 效果是一样的
        return okLoginName.equals(loginName) && okPassWord.equals(passWord);
    }
}
