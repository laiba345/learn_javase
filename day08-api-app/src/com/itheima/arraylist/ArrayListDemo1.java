package com.itheima.arraylist; // idea中会自动创建相应的包裹

import java.util.ArrayList;

/**
    目标：要求同学们掌握如何创建ArrayList集合的对象，并熟悉ArrayList提供的常用方法。
 */
public class ArrayListDemo1 {
    /*
    *   面向对象高级语法: 一个一个API
    *   为什么要学习别人写好的程序? 不需要重复造轮子, 开发效率高
    *
    *   Java提供了哪些API给咱们使用呢?
    *       - String、ArrayList
    *
    *   String; String代表字符串对象,可以用来封装字符串数据,并提供了很多操作字符串的方法
    *   ArrayList; 是集合中最常用的一种,集合类似于数组,也是容器,用来装数据的,但集合的大小可变
    *       - 集合是一种容器,用来装数据的,类似于数组
    *       - 数组在定义完成并启动后,长度就固定了,而集合的大小可变,开发中用的更多;
    *
    *   ArrayList
    *       - 会提供创建容器对象的方式
    *       - 会提供相应的方法对容器进行操作
    *           - 增删改查
    *   1. 创建对象 2. 增删改查的方法 3. 容器的其他特点
    *
    *   有数组,为啥还学习集合?
    *       - 数组定义完成并启动后,类型确定、长度固定
    *       - 集合大小可变,提供的功能更为丰富,开发中用的更多
    *   先学习包, 为什么先学习包?
    *       - 包是分门别类管理程序的
    *       - 别人写好的程序通常都在别人的包里面;
    *
    *   集合是什么? 有什么特点?
    *       - 集合是一种容器, 用来存储数据的
    *       - 集合的大小可变
    *
    *   ArrayList是什么? 怎么使用?
    *       - 是集合的一种, ArrayList是泛型类, 可以约束存储的数据类型
    *
    *   ArrayList的常用方法?
    *
    * */
    public static void main(String[] args) {
        // 1、创建一个ArrayList的集合对象
        // ArrayList<String> list = new ArrayList<String>();
        // 从jdk 1.7开始才支持的
        ArrayList<String> list = new ArrayList<>(); // 约束集合中的内容;

        list.add("黑马");
        list.add("黑马");
        list.add("Java");
        System.out.println(list);

        // 2、往集合中的某个索引位置处添加一个数据
        list.add(1, "MySQL");
        System.out.println(list);

        // 3、根据索引获取集合中某个索引位置处的值
        String rs = list.get(1);
        System.out.println(rs);

        // 4、获取集合的大小（返回集合中存储的元素个数）
        System.out.println(list.size());

        // 5、根据索引删除集合中的某个元素值，会返回被删除的元素值给我们
        System.out.println(list.remove(1));
        System.out.println(list);

        // 6、直接删除某个元素值，删除成功会返回true，反之
        System.out.println(list.remove("Java"));
        System.out.println(list);

        list.add(1, "html");
        System.out.println(list);

        // 默认删除的是第一次出现的这个黑马的数据的
        System.out.println(list.remove("黑马"));
        System.out.println(list);

        // 7、修改某个索引位置处的数据，修改后会返回原来的值给我们
        System.out.println(list.set(1, "黑马程序员"));
        System.out.println(list);
    }
}



















