final关键字
1. final关键字是最终的意思,可以修饰(类、方法、变量);
2. 修饰类; 该类被称为最终类, 特点是不能被继承了;
3. 修饰方法; 该方法被称为最终方法, 特点是不能被重写了;
4. 修饰变量; 该变量只能被赋值一次;

常量
1. 使用了 static final 修饰的成员变量就被称为常量;
2. 作用: 通常用于记录系统的配置信息; public static final String SCHOOL_NAME = “黑马“
3. 使用常量记录系统配置信息的优势、执行原理;
    - 代码可读性好;
    - 程序编译后,常量会被”宏替换“
