package com.jdbc.datasource;

import com.jdbc.Utils.JDBCUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * ClassName: JDBCUtilsByDruid_Use
 * Package: com.jdbc.datasource
 * Description:
 *
 * @Author Null_jun
 * @Create 2024/1/2 18:46
 * @Version 1.0
 */
public class JDBCUtilsByDruid_Use {
    @Test
    public void testDML() { // insert update delete
        // 1. 得到连接; 都是可以很方便的用于扩大作用域;
        Connection connection = null;

        // 2. 组织一个sql
        String sql = "update actor set name = ? where id = ?";
        PreparedStatement preparedStatement = null;
        // 3. 创建PreparedStatement对象
        try {
            connection = JDBCUtilsByDruid.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            // 给占位符赋值
            preparedStatement.setString(1, "宁德时代");
            preparedStatement.setInt(2, 2);
            // 执行
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            // 关闭资源
            JDBCUtilsByDruid.close(null, preparedStatement, connection);
        }
    }
}
