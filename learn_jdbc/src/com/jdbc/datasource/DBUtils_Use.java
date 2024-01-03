package com.jdbc.datasource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * ClassName: JDBCUtilsByDruid_Use
 * Package: com.jdbc.datasource
 * Description:
 *
 * @Author Null_jun
 * @Create 2024/1/2 18:46
 * @Version 1.0
 */
public class DBUtils_Use {
    // 使用apache-DBUtils 工具类 + druid完成对表的crud操作
    @Test
    public void testQueryMany() throws SQLException { // 返回结果是多行的情况
        // 1. 得到连接(druid)
        Connection connection = JDBCUtilsByDruid.getConnection();
        // 2. 使用DBUtils类和接口, 先引入DBUtils相关的jar包, 加入到本Project
        // 3. 创建一个QueryRunner
        QueryRunner queryRunner = new QueryRunner();
        // 4. 就可以执行相关的方法, 返回ArrayList结果集
        // String sql = "select * from actor where id = ?";
        //
        String sql = "select id, name from actor where id >= ?";
        /*
        *   1. query方法就是执行sql语句, 得到resultSet,封装到ArrayList集合中
        *   2. 返回集合
        *   3. connection: 连接
        *   4. sql: 执行的sql语句
        *   5. new BeanListHandler<>(Actor.class)
        *       - 将resultset -> Actor对象 -> 封装到ArrayList
        *       - 其底层是使用反射机制去获取Actor类的属性,然后进行封装
        *   6. 1就是给sql语句中的? 赋值, 可以有多个值,因为其是可变参数Object ... params
        *   7. 底层得到的resultSet, 会在query关闭, 关闭PreparedStatement
        * */
        List<Actor> list =
                queryRunner.query(connection, sql, new BeanListHandler<>(Actor.class), 1);
        System.out.println("输出集合的信息");
        // 数据库中的类型要和java程序类中的类型相同
        for(Actor actor : list) {
            System.out.println(actor);
        }
        // 释放资源
        JDBCUtilsByDruid.close(null, null, connection);
    }

    // 使用apache-DBUtils 工具类 + druid完成返回的结果是单行记录(单个对象)
    @Test
    public void testQuerySingle() throws SQLException { // 返回结果是多行的情况
        // 1. 得到连接(druid)
        Connection connection = JDBCUtilsByDruid.getConnection();
        // 2. 使用DBUtils类和接口, 先引入DBUtils相关的jar包, 加入到本Project
        // 3. 创建一个QueryRunner
        QueryRunner queryRunner = new QueryRunner();
        // 4. 就可以执行相关的方法, 返回ArrayList结果集
        String sql = "select id, name from actor where id = ?";
        Actor actor =
                queryRunner.query(connection, sql, new BeanHandler<>(Actor.class), 1);
        System.out.println("输出集合的信息");
        System.out.println(actor); // 如果查询的id不存在, 直接返回一个null
        // 释放资源
        JDBCUtilsByDruid.close(null, null, connection);
    }

    // 使用apache-DBUtils 工具类 + druid完成查询结果是单行单列-返回的就是Object(可能为null)
    @Test
    public void testQuerySingleColumn() throws SQLException { // 返回结果是多行的情况
        // 1. 得到连接(druid)
        Connection connection = JDBCUtilsByDruid.getConnection();
        // 2. 使用DBUtils类和接口, 先引入DBUtils相关的jar包, 加入到本Project
        // 3. 创建一个QueryRunner
        QueryRunner queryRunner = new QueryRunner();
        // 4. 返回单行单列; 返回的就是Object
        String sql = "select name from actor where id = ?";
        // 因为返回的是一个对象,使用的handler 就是 ScalarHandler
        Object obj =
                queryRunner.query(connection, sql, new ScalarHandler(), 1);
        System.out.println("输出集合的信息");
        System.out.println(obj); // 如果查询的id不存在, 直接返回一个null
        // 释放资源
        JDBCUtilsByDruid.close(null, null, connection);
    }
    // // 使用apache-DBUtils 工具类 + druid完成DML(update、insert、delete)
    @Test
    public void testDML() throws SQLException { // 返回结果是多行的情况
        // 1. 得到连接(druid)
        Connection connection = JDBCUtilsByDruid.getConnection();
        // 2. 使用DBUtils类和接口, 先引入DBUtils相关的jar包, 加入到本Project
        // 3. 创建一个QueryRunner
        QueryRunner queryRunner = new QueryRunner();
        // 4. 这里组织
        // String sql = "update actor set name = ? where id = ?";
        String sql = "insert into actor values (null, ?, ?, ?, ?)";
        // 因为返回的是一个对象,使用的handler 就是 ScalarHandler
        /*
        *   1. 执行dml操作的是queryRunner.update()
        *   2. 返回值受影响的行数
        * */
        int affected =
                // queryRunner.update(connection, sql, "张三丰", 1);
                queryRunner.update(connection, sql, "林青霞", "女", "1996-10-10", "117");
        System.out.println(affected > 0 ? "执行成功" : "执行没有影响到表");
        // 释放资源
        JDBCUtilsByDruid.close(null, null, connection);
    }
}
