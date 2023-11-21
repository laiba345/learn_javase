package com.itheima.javabean;

public class Student {
    /*
    *   实体类
    *   - 1. 必须私有成员变量,并为每个成员变量都提供get和set方法
    *   - 2. 必须为类提供一个公开的无参数构造器
    *   - 3. 仅仅只是一个用来保存数据的java类,可以用它创建对象,保存某个事物的数据
    *
    *   实体类有啥应用场景
    *   - 实体类只负责数据存取,而对数据的处理交给其他类来完成,以实现数据和数据业务相分离
    *   - 实体类对应的是软件开发里现在比较流行的开发方式,数据和数据的业务处理相分离
    * */
    // 1、必须私有成员变量，并为每个成员变量都提供get set方法
    private String name;
    private double score;

    // 2、必须为类提供一个公开的无参数构造器
    public Student() {
    }


    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
