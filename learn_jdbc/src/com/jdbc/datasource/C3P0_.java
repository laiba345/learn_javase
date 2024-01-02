package com.jdbc.datasource;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * ClassName: C3P0_
 * Package: com.jdbc.C3P0
 * Description:
 *
 * @Author Null_jun
 * @Create 2024/1/2 15: 11
 * @Version 1.0
 * 演示C3P0的使用
 */
public class C3P0_ {
    @Test
    // 方式1; 相关参数在程序中指定user, url, password等;
    public void testC3P0_01() throws Exception{
        // 1. 创建一个数据源对象
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        // 2. 通过配置文件mysql.properties 来获取相关连接的信息
        Properties properties = new Properties();
        properties.load(new FileInputStream("/Users/kangder/Java/learn_java/learn_javase/learn_jdbc/src/com/jdbc/mysql.properties"));
        // 读取相关的属性
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");

        /*
        * 其实在数据源comboPooledDataSourc e当中就是一个个连接池
        * 给数据源comboPooledDataSource 设置相关的参数
        * 注意: 连接管理是由comboPooledDataSource来管理
        * */
        comboPooledDataSource.setDriverClass(driver);
        comboPooledDataSource.setJdbcUrl(url);
        comboPooledDataSource.setUser(user);
        comboPooledDataSource.setPassword(password);

        // 最大连接数; 如果最大连接数满了,就弄到等待队列当中;
        // 设置初始化连接数
        comboPooledDataSource.setInitialPoolSize(10);
        // 最大连接数
        comboPooledDataSource.setMaxPoolSize(50);
        // 下面这个方法就是从DataSource接口实现
        // 测试连接池的效率,测试对mysql进行 5000次操作;
        long start = System.currentTimeMillis();
        for(int i = 0; i < 5000; i++) {
            Connection connection = comboPooledDataSource.getConnection();
            connection.close();
        }
        long end = System.currentTimeMillis();
        System.out.println("连接ok, 耗时为" + (end - start));
    }

    // 方式二; 使用配置文件模板来完成
    /*
    *   1. 将c3p0提供的 拷贝到src目录下
    *   2. 该文件指定了连接数据库和连接池的相关参数;
    *   将这个文件直接放置到src文件夹下即可;
    * */
    @Test
    public void testC3P0_02() throws SQLException {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource("hsp_edu");
        Connection connection = comboPooledDataSource.getConnection();
        System.out.println("连接成功!!!");
        connection.close();
    }
}
