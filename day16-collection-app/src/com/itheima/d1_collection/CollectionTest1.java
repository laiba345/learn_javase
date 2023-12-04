package com.itheima.d1_collection;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * 目标：认识Collection体系的特点。
 * Collection代表单列集合; 每个元素(数据)只包含一个值;
 * Map代表双列集合,每个元素包含两个值(键值对)
 *
 *
 */
public class CollectionTest1 {
    public static void main(String[] args) {
        // 简单确认一下Collection集合的特点。
        // 有序、可重复、有索引
        ArrayList<String> list = new ArrayList<>(); // 有序 可重复 有索引
        list.add("java1");
        list.add("java2");
        list.add("java1");
        list.add("java2");
        System.out.println(list);

        // 无序、不重复、无索引
        HashSet<String> set = new HashSet<>(); // 无序，不重复，无索引
        set.add("java1");
        set.add("java2");
        set.add("java1");
        set.add("java2");
        set.add("java3");
        System.out.println(set);
    }
}
