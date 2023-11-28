package com.itheima.d14_extends_constructor;

class F{
//    public F(){
//        System.out.println("===父类F的 无参数构造器 执行了===");
//    }

    public F(String name, int age){

    }
}

class Z extends F{
    // 这个是一个构造函数,用于在创建类的新实例时初始化对象;
    // 构造函数通常用于初始化类的实例,在实例化对象时被调用,没有返回类型;
    public Z(){
        // super(); // 默认存在的
        super("播妞", 17);
        System.out.println("===子类Z的 无参数构造器 执行了===");
    }

    public Z(String name){
        // super(); // 默认存在的
        super("播妞", 17);
        System.out.println("===子类Z的 有参数构造器 执行了===");
    }
}

public class Test {
    public static void main(String[] args) {
        // 目标：先认识子类构造器的特点，再掌握这个特点的常见应用场景。
        Z z = new Z();
        Z z2 = new Z("播妞");
    }
}
