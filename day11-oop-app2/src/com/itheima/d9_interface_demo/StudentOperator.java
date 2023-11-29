package com.itheima.d9_interface_demo;

import java.util.ArrayList;

public interface StudentOperator {
    // 拥有两个抽象方法;
    void printAllInfo(ArrayList<Student> students);
    void printAverageScore(ArrayList<Student> students);
}
