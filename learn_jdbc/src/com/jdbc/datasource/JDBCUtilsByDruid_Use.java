package com.jdbc.datasource;

import com.jdbc.Utils.JDBCUtils;
import org.junit.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;

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
    public void testDruid() { // insert update delete
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

    // 使用土方法来解决ResultSet => 封装 => ArrayList
    @Test
    public void testSelectToArrayList() { // insert update delete
        // 1. 得到连接; 都是可以很方便的用于扩大作用域;
        Connection connection = null;

        // 2. 组织一个sql
        String sql = "select * from actor where id = ?";
        PreparedStatement preparedStatement = null;
        ResultSet set = null;
        ArrayList<Actor> list = new ArrayList<Actor>(); // 创建ArrayList对象,存放Actor
        // 3. 创建PreparedStatement对象
        try {
            connection = JDBCUtilsByDruid.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            // 如果使用了占位符就需要使用此处
            preparedStatement.setInt(1, 1); // 给占位符赋上相应的值;
            // 执行
            set = preparedStatement.executeQuery();
            // 遍历该结果集
            while(set.next()) {
                int id = set.getInt("id");
                String name = set.getString("name");
                String sex = set.getString("sex");
                Date borndate = set.getDate("borndate");
                String phone = set.getString("phone");
                // System.out.println(id + "\t" + name + "\t" + sex + "\t" + borndate + "\t" + phone);
                // 把得到的res  Actor(id, name, sex, borndate, phone));
            }
            System.out.println("得到的集合数据是" + list);
            for(Actor actor : list) {
                // 想要取值哪一个信息都是可以的;
                System.out.println(actor.getId());
            }
            // connection.close();// 关闭连接
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            // 关闭资源
            JDBCUtilsByDruid.close(set, preparedStatement, connection);
        }
        // 因为ArrayList和connection没有任何关联, 所以该集合可以复用
        // return list;
    }
}
