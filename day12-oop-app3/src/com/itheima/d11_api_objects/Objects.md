Objects类;
- Objects是一个工具类; 提供了很多操作对象的静态方法给我们使用;
    - 是一个工具类,工具类中的很多方法是可以直接通过类名进行调用的;
- 常用方法;
    - equals(Object a, Object, b); 先做非空判断,再比较两个对象;
      - 如果用两个对象进行equals比较的话,可能会出现空指针异常的操作;
    - isNull(Object obj); 判断对象是否为Null,为null返回true,反之
    - nonNull(Object obj); 判断对象是否不为null,不为null返回true;
- 