package com.jdbc.batch;

import com.jdbc.Utils.JDBCUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * ClassName: Batch_
 * Package: com.jdbc.batch
 * Description:
 *
 * @Author Null_jun
 * @Create 2024/1/1 17:15
 * @Version 1.0
 * 演示Java的批处理
 */
public class Batch_ {
    // 传统方法, 添加5000条数据到admin2
    // 746s;
    @Test
    public void noBatch() throws SQLException {
        Connection connection = JDBCUtils.getConnection();
        String sql = "insert into admin2 values(null, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        System.out.println("开 始执行了");
        long start = System.currentTimeMillis(); // 开始时间
        for(int i = 0; i < 5000;  i++){
            preparedStatement.setString(1, "jack"+i);
            preparedStatement.setString(2, "666");
            preparedStatement.executeUpdate();
        }
        long end = System.currentTimeMillis(); // 结束时间
        System.out.println("传统的方式耗时" + (end - start));
        // 关闭连接
        JDBCUtils.close(null, preparedStatement, connection);
    }

    // 使用批量方式添加数据
    // 89s
    @Test
    public void batch() throws SQLException {
        Connection connection = JDBCUtils.getConnection();
        String sql = "insert into admin2 values(null, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        System.out.println("开 始执行了");
        long start = System.currentTimeMillis(); // 开始时间
        for(int i = 0; i < 5000;  i++){
            preparedStatement.setString(1, "jack"+i);
            preparedStatement.setString(2, "666");
            // preparedStatement.executeUpdate();
            // 将sql语句加入到批处理包中 -> 看源码
            /*
            *   1. 创建ArrayList - elementData => Object[]
            *   2. elementData => Object[] 就会存放我们预处理的是sql语句
            *   3. 当elementData满后, 就按照1.5倍扩容
            *   4. 当添加到指定的值后, 就executeBatch
            *   5. 批量处理会减少我们发送sql语句的网络开销,而且减少编译次数,因此效率提高
            * */
            preparedStatement.addBatch();
            // 当有1000条记录时,再批量执行
            if((i + 1) % 1000 == 0) {
                preparedStatement.executeBatch();
                // 清空一把
                preparedStatement.clearBatch();
            }
        }
        long end = System.currentTimeMillis(); // 结束时间
        System.out.println("传统的方式耗时" + (end - start));
        // 关闭连接
        JDBCUtils.close(null, preparedStatement, connection);
    }
}
