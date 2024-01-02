package com.jdbc.datasource;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

/**
 * ClassName: Druid_
 * Package: com.jdbc.C3P0
 * Description:
 *
 * @Author Null_jun
 * @Create 2024/1/2 17:39
 * @Version 1.0
 * 测试 Druid的使用
 */
public class Druid_ {
    @Test
    public void testDruid() throws Exception{
        // 非常简洁
        // 下面的相关文件可以到官方下载;
        // 1. 加入Druid jar包
        // 2. 加入配置文件; druid.properties,将该文件拷贝到项目的src目录即可;
        // 3. 创建Properties对象, 读取配置文件; 路径名别写错
        Properties properties = new Properties();
        properties.load(new FileInputStream("/Users/kangder/Java/learn_java/learn_javase/learn_jdbc/src/druid.properties"));
        // 4. 创建一个指定参数的数据库连接池
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        Connection connection = dataSource.getConnection();
        System.out.println("连接成功");
        connection.close();
    }
}
