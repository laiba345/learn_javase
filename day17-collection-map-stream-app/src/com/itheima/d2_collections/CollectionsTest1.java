package com.itheima.d2_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 目标：掌握Collections集合工具类的使用。
 */
public class CollectionsTest1 {
    public static void main(String[] args) {
        // 1、public static <T> boolean addAll(Collection<? super T> c, T...elements)：为集合批量添加数据
        List<String> names = new ArrayList<>();
        // 给集合添加元素的方法; 为集合批量添加相关数据的操作;
        Collections.addAll(names, "张三", "王五", "李四", "张麻子");
        System.out.println(names);

        // 2、public static void shuffle(List<?> list)：打乱List集合中的元素顺序。
        // 打乱集合中的数据
        Collections.shuffle(names);
        System.out.println(names);

        // 3、 public static <T> void sort(List<T> list)：对List集合中的元素进行升序排序。
        // 对集合中的数据进行升序排序操作;
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(2);
        Collections.sort(list);
        System.out.println(list);

        List<Student> students = new ArrayList<>();
        students.add(new Student("蜘蛛精",23, 169.7));
        students.add(new Student("紫霞",22, 169.8));
        students.add(new Student("紫霞",22, 169.8));
        students.add(new Student("至尊宝",26, 165.5));
        // Collections.sort(students);
        // System.out.println(students);

        // 4、public static <T> void sort(List<T> list， Comparator<? super T> c): 对List集合中元素，按照比较器对象指定的规则进行排序
        // 这是一个匿名内部类，实现了 Comparator 接口，用于定义自定义的比较逻辑
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.getHeight(), o2.getHeight());
            }
        });
        System.out.println(students);
    }
}
