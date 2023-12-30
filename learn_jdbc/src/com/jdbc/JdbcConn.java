package com.jdbc;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * ClassName: JdbcConn
 * Package: com.jdbc
 * Description:
 *
 * @Author Null_jun
 * @Create 2023/12/28 17:19
 * @Version 1.0
 */
public class JdbcConn {
    @Test
    // 方式5; 增加配置文件，让连接mysql更加灵活
    public void connect05() throws IOException, ClassNotFoundException, SQLException {
        // 通过Properties对象获取配置文件的信息
        Properties properties1 = new Properties();
        // 使用具体的绝对路径来查找实现;
        properties1.load(new FileInputStream("/Users/kangder/Java/learn_java/learn_javase/learn_jdbc/src/com/jdbc/mysql.properties"));
        // 获取相关的值
        String user = properties1.getProperty("use r");
        String password = properties1.getProperty("password");
        String url = properties1.getProperty("url");
        String driver = properties1.getProperty("driver");

        // 建议写上
        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, user, password);

        System.out.println("方式5" + connection);
    }
}
