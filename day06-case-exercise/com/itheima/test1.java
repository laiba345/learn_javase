package com.itheima;

/**
 * ClassName: test1
 * Package: com.itheima
 * Description:
 *
 * @Author Null_jun
 * @Create 2023/11/18 22:35
 * @Version 1.0
 */
public class test1 {
    public static void main(String[] args) {
        // 目标: 完成买飞机票的案例
        double price = calculate(1000, 8, "经济舱");
        System.out.println("优惠价是" + price);
    }

    public static double calculate(double price, int month, String type) {
        // 1. 判断当前月份是淡季还是旺季
        if(month >= 5 && month <= 10) {
            switch (type) {
                case "头等舱":
                    price *= 0.9;
                    break;
                case "经济舱":
                    price *= 0.85;
                    break;
            }
        }else {
            switch (type) {
                case "头等舱":
                    price *= 0.7;
                    break;
                case "经济舱":
                    price *= 0.65;
                    break;
            }
        }
        return price;
    }
}
