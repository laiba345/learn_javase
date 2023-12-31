package com.jdbc.Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * ClassName: JDBCUtils
 * Package: com.jdbc.Utils
 * Description:
 *
 * @Author Null_jun
 * @Create 2024/1/1 10:47
 * @Version 1.0
 * 这是一个工具类,完成mysql的连接和关闭资源
 * !!! 书写了一个可爱的工具类;
 */
public class JDBCUtils {
    // 定义相关的属性(4个), 因为只需要一份,所以 我们做出static
    private static String user; // 用户名
    private static String password; // 密码
    private static String url; // url
    private static String driver; // 驱动名

    /*
    *  在static代码块去初始化
    *  static还可以用于静态代码块,静态代码块在类加载时执行,
    *  并且只执行一次,这对于一些初始化的操作非常有用;
    * */
    static {
        /*
        *   选中某段代码,使用option+command+t使用快捷键生成代码块
        *
        * */
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("/Users/kangder/Java/learn_java/learn_javase/learn_jdbc/src/com/jdbc/mysql.properties"));
            // 读取相关的属性
            user = properties.getProperty("user");
            password = properties.getProperty("password");
            url = properties.getProperty("url");
            driver = properties.getProperty("driver");
        } catch (IOException e) {
            // 在实际开发中,我们通常将编译异常转成运行异常
            // 这时调用者可以选择捕获该异常,也可以选择默认处理该异常,比较方便
            throw new RuntimeException(e);
        }
    }
    // 连接数据库,返回Connection
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e); // 原因同上
        }
    }
    /*
    *   关闭相关资源
    *   1. ResultSet结果集
    *   2. Statement 或者 PreparedStatement
    *   3. Connection
    *   注意: 如果需要关闭资源,就传入对象,否则传入null
    * */
    public static void close(ResultSet set, Statement statement, Connection connection) {
        // 判断是否为null
        try {
            if(set != null) {
                set.close();
            }
            if(statement != null) {
                statement.close();
            }
            if(connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
