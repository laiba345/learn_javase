package com.itheima.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 菜品操作类：负责上架和浏览功能的实现。
 */
public class FoodOperator {
    // 1、定义一个ArrayList集合对象，负责存储菜品对象信息
    // 集合当中可以存取一个一个的对象的相关操作; 集合中放的是商品的相关内容;
    private ArrayList<Food> foodList = new ArrayList<>();
    // foodList = []

    // 2、开发功能：上架菜品功能。 直接用来模拟: 菜品或者是数据的相关上架操作;
    public void addFood(){
        // 3、创建一个菜品对象，封装上架的菜品信息
        Food f = new Food();

        // 4、录入菜品信息进去
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入该菜品名称：");
        String name = sc.next();
        f.setName(name);

        System.out.println("请您输入该菜品价格：");
        double price = sc.nextDouble();
        f.setPrice(price);

        System.out.println("请您输入该菜品描述：");
        String desc = sc.next();
        f.setDesc(desc);

        // 5、把菜品对象存入到集合中去
        foodList.add(f);
        System.out.println("上架成功！");
    }
    
    // 6、展示菜品
    // foodList = [f1, f2, f3, ... ]
    //                     i
    public void showAllFoods(){
        if(foodList.size() == 0) {
            System.out.println("什么菜品都么有，先去上架！！");
            return;
        }
        for (int i = 0; i < foodList.size(); i++) {
            // 因为foodList存取的是一个个菜品对象;
            Food f = foodList.get(i);
            System.out.println(f.getName());
            System.out.println(f.getPrice());
            System.out.println(f.getDesc());
            System.out.println("-----------------");
        }
    }

    /** 负责展示操作界面。 */
    public void start(){
        while (true) {
            System.out.println("请选择功能：");
            System.out.println("1、上架菜品");
            System.out.println("2、展示菜品");
            System.out.println("3、退出");

            Scanner sc = new Scanner(System.in);
            System.out.println("请选择您的操作：");
            String command = sc.next();
            // 通过switch...case...来选取具体是哪一个命令
            switch (command) {
                case "1":
                    addFood();
                    break;
                case "2":
                    showAllFoods();
                    break;
                case "3":
                    System.out.println("下次再来哦！");
                    return; // 干掉方法！
                default:
                    System.out.println("您输入的命令不存在！");
            }
        }
    }
}
