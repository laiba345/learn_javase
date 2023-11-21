package com.itheima.thisdemo;

public class Student {
    String name;
    double score;
    public void test(Student this){
        System.out.println(this);
    }

    public void printPass(double score){
        /*
        *   this是什么?
        *       - this就是一个变量,可以用在方法中,来拿到当前对象
        *       - 哪个对象调用方法,this就指向哪个对象,也就是拿到那个对象
        *       - this可以拿到地址
        *   this有啥应用场景?
        *       - this主要用来解决: 变量名称冲突问题
        * */
        if(this.score >= score){
            System.out.println("恭喜您，您成功考入了哈佛大学~~");
        }else {
            System.out.println("很遗憾，您没有考过~~");
        }
    }
}
