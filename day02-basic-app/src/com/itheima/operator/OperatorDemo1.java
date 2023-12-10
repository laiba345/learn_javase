package com.itheima.operator;

public class OperatorDemo1 {
    public static void main(String[] args) {
        // 目标：掌握基本的算术运算符的使用。
        int a = 10;
        int b = 2;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b); // 20
        System.out.println(a / b); // 5
        System.out.println(5 / 2); // 2.5 ==> 2
        System.out.println("值为:" + 5.0 / 2); // 2.5
        int i = 5;
        int j = 2;
        System.out.println(1.0 * i / j); // 2.5

        System.out.println(a % b); // 0
        System.out.println(3 % 2); // 1

        System.out.println("---------------------------------------------------");

        // 目标2：掌握使用+符号做连接符的情况。
        int a2 = 5;
        System.out.println("abc" + a2); // "abc5"
        System.out.println(a2 + 5); //  10
        System.out.println("itheima" + a2 + 'a'); // "itheima5a"
        /*
        * 在这段代码中，`a2` 被赋值为整数 `5`，然后通过sout输出了 `a2 + 'a' + "itheima"` 的结果。
        * 在 Java 中，单引号括起来的字符表示字符类型，其对应 ASCII 码的值。
        * 字符 `'a'` 对应的 ASCII 码是 `97`。当你执行 `a2 + 'a'` 时，实际上进行了数学运算 `5 + 97`，结果为 `102`。
        * 然后将 `102` 与字符串 `"itheima"` 拼接输出，所以最终输出的结果是 `102itheima`。
        * */
        System.out.println(a2 + 'a' + "itheima"); // 102itheima
    }
}
