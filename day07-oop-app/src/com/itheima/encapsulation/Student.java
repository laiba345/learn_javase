package com.itheima.encapsulation;

public class Student {
    /*
    *   什么是封装?
    *   - 封装就是用类设计对象处理某一个事物的数据时,应该把要处理的数据
    *   以及处理这些数据的方法,设计到一个对象中去
    *
    *   封装的设计规范
    *   - 合理隐藏、合理暴露
    *
    *   代码层面如何控制对象的成员公开或隐藏
    *   - 公开成员, 可以使用public修饰
    *   - 隐藏成员, 使用private修饰
    * */

//    private double chengji;
//    public void setScore(double chengji) {
//        if(chengji >= 0 && chengji <= 100) {
//            this.score = score;
//        }else {
//            System.out.println("数据非法");
//        }
//    }
//    public double getScore() {
//        return chengji
//    }
    public double score;

    // 观察是否需要供给外界访问操作;
    private void printPass(){
        System.out.println(score >= 60 ? "成绩及格" :  "成绩不及格");
    }
}