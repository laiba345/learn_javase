package com.itheima.overload;

public class MethodTest2 {

    // 方法重载的应用场景
    // 开发中我们经常需要为处理一类业务, 提供多种解决方案, 此时用方法重载来设计是很专业的
    public static void main(String[] args) {
        // 目标：掌握方法重载的应用场景。
        fire(); // 可以重复的进行着方法的嵌套工作
        fire("岛国2");
        fire("米国", 999);
    }

    public static void fire(){
        fire("岛国");
    }

    public static void fire(String country){
        fire(country, 1);
    }

    public static void fire(String country, int number){
        System.out.println("发射了" + number + "枚武器给" + country);
    }
}
