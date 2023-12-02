Arrays类的相关内容
1. public static String toString(类型[] arr): 返回数组的内容
2. public static 类型[] copyOfRange(类型[] arr, 起始索引, 结束索引) ：拷贝数组（指定范围，包前不包后）
    - 返回到一个新的数组中来进行接收操作;
3. public static copyOf(类型[] arr, int newLength)：拷贝数组，可以指定新数组的长度。
4. public static setAll(double[] array, IntToDoubleFunction generator)：把数组中的原数据改为新数据又存进去。
5. public static void sort(类型[] arr)：对数组进行排序(默认是升序排序)

如果数组中存储的是对象,如何排序呢?  官方是没有指定好的;
- 自己制定比较规则
   - 让该对象的类实现Comparable(比较规则)接口,然后重写compareTo方法,自己制定比较规则;
   - 使用下面这个sort方法,创建Comparator比较器接口的匿名内部类对象,然后自己制定比较规则
     - public static <T> void sort(T[] arr, Comparator<? super T> c)
       - 对数组进行排序(支持自定义排序规则;)