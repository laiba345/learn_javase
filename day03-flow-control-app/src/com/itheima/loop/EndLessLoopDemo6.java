package src.com.itheima.loop;

public class EndLessLoopDemo6 {
    public static void main(String[] args) {
        // 目标：掌握死循环的写法。
      /*  for ( ; ; ){
            System.out.println("Hello World1");
        }*/

      /*  while (true) {
            System.out.println("Hello World2");
        }*/
        // do...while; 肯定会先执行一次;
        do {
            System.out.println("Hello World3");
        }while (true);
    }
}
