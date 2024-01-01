package com.jdbc.Transaction;

import com.jdbc.Utils.JDBCUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * ClassName: Transaction_
 * Package: com.jdbc.Transaction
 * Description:
 *
 * @Author Null_jun
 * @Create 2024/1/1 16:21
 * @Version 1.0
 */
public class Transaction_ {
    // 没有使用事务
    @Test
    public void testDML() { // insert update delete
        // 1. 得到连接; 都是可以很方便的用于扩大作用域;
        Connection connection = null;

        // 2. 组织一个sql
        String sql = "update account set money = money-100 where id = 200";
        String sql2 = "update account set money = money+100 where id = 300";
        PreparedStatement preparedStatement = null;
        // 3. 创建PreparedStatement对象
        try {
            connection = JDBCUtils.getConnection(); // 在默认情况下,connection是默认自动提交
            // 将connection 设置为不自动提交
            connection.setAutoCommit(false); // 相当于开启了事务;
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate(); // 执行第一条sql

            int i = 1/0; // 抛出异常,后面的sql代码不执行了;
            preparedStatement = connection.prepareStatement(sql2);
            preparedStatement.executeUpdate(); // 执行第二条sql

            // 在这里提交事务
            connection.commit();
        } catch (SQLException e) {
            /*
            * 抛出异常,进入到这里
            * 在这里我们可以进行回滚,即撤销执行的SQL
            * */
            System.out.println("执行发生了异常,撤销执行的sql");
            try {
                connection.rollback(); // 默认回滚到事务开始的状态;
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            throw new RuntimeException(e);
        } finally {
            // 关闭资源
            JDBCUtils.close(null, preparedStatement, connection);
        }
    }

    // 使用事务来解决
    public void useTransaction() {
        // 1. 得到连接; 都是可以很方便的用于扩大作用域;
        Connection connection = null;

        // 2. 组织一个sql
        String sql = "update account set money = money-100 where id = 200";
        String sql2 = "update account set money = money+100 where id = 300";
        PreparedStatement preparedStatement = null;
        // 3. 创建PreparedStatement对象
        try {
            connection = JDBCUtils.getConnection(); // 在默认情况下,connection是默认自动提交
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate(); // 执行第一条sql

            int i = 1/0; // 抛出异常,后面的sql代码不执行了;
            preparedStatement = connection.prepareStatement(sql2);
            preparedStatement.executeUpdate(); // 执行第二条sql

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            // 关闭资源
            JDBCUtils.close(null, preparedStatement, connection);
        }
    }
}
