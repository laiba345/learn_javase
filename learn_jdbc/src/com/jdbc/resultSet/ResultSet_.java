package com.jdbc.resultSet;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * ClassName: ResultSet
 * Package: com.jdbc.resultSet
 * Description:
 *
 * @Author Null_jun
 * @Create 2023/12/30 21:54
 * @Version 1.0
 * 演示select语句 返回ResultSet, 并取出结果;
 */
public class ResultSet_ {
    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
        // 通过Properties对象获取配置文件的信息
        Properties properties1 = new Properties();
        // 使用具体的绝对路径来查找实现;
        properties1.load(new FileInputStream("/Users/kangder/Java/learn_java/learn_javase/learn_jdbc/src/com/jdbc/mysql.properties"));
        // 获取相关的值
        String user = properties1.getProperty("user");
        String password = properties1.getProperty("password");
        String url = properties1.getProperty("url");
        String driver = properties1.getProperty("driver");

        // 1. 注册驱动
        Class.forName(driver);
        // 2. 得到连接
        Connection connection = DriverManager.getConnection(url, user, password);
        // 3. 得到Statement
        Statement statement = connection.createStatement();
        // 4. 组织sql
        String sql = "select id, name, sex  , borndate from actor";
        // statement中有很多对sql语句处理的相关方法等;
        ResultSet resultSet = statement.executeQuery(sql);
        /*
        * 执行给定的SQL语句,该语句返回单个ResultSet对象
            id	name	sex	borndate	phone
            1	hk	男	1999-05-17 00:00:00	110
            2	zj	男	1998-07-27 00:00:00	118
            3	zst	女	1998-07-27 00:00:00	111
            4	zst	女	1998-07-27 00:00:00	111
        * */
        /*
        * ResultSet底层原理见图
        * */
        // 5. 使用while循环取出数据; 可以理解为指向表头
        while(resultSet.next()) { // 让光标向后移动,如果没有更多行,则返回false
            int id = resultSet.getInt(1); // 获取该行的第一列
            String name = resultSet.getString(2); // 第二列
            String sex = resultSet.getString(3);
            Date date = resultSet.getDate(4);
            System.out.println(id + "\t" + name + "\t" + sex + "\t" + date);
        }
        // 6. 关闭连接
        resultSet.close();
        System.out.println("方式5" + connection);
    }
}
