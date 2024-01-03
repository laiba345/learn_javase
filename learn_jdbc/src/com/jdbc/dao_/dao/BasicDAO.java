package com.jdbc.dao_.dao;

import com.jdbc.dao_.utils.JDBCUtilsByDruid;
import com.mysql.cj.Query;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * ClassName: BasicDAO
 * Package: com.jdbc.dao_.dao
 * Description:
 *
 * @Author Null_jun
 * @Create 2024/1/3 19:05
 * @Version 1.0
 * 开发BasicDAO, 是其他DAO的父类
 */
public class BasicDAO<T> { // 泛型 指定具体类型
    private QueryRunner queryRunner = new QueryRunner();
    // 开发通用的dml方法, 针对任意的表; 可以动态的指定sql语句
    public int update(String sql, Object... parameters) {
        Connection connection = null;
        try {
            connection = JDBCUtilsByDruid.getConnection();
            int update = queryRunner.update(connection, sql, parameters);
            return update;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtilsByDruid.close(null, null, connection);
        }
    }

    // 返回多个对象(即查询的结果是多行) 针对任意表
    /*
    *  1 sql语句, 可以有 ?
    *  2 clazz 传入一个类的Class对象,比如Actor.class
    *  3 传入 ? 具体的值, 可以有多个
    *  return 根据Actor.class返回对应的ArrayList集合;
    * */
    public List<T> queryMulti(String sql, Class<T> clazz, Object... parameters) {
        Connection connection = null;
        try {
            connection = JDBCUtilsByDruid.getConnection();
            return queryRunner.query(connection, sql, new BeanListHandler<T>(clazz), parameters);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtilsByDruid.close(null, null, connection);
        }
    }

    // 查询单行结果的通用方法
    public T querySingle(String sql, Class<T> clazz, Object... parameters) {
        Connection connection = null;
        try {
            connection = JDBCUtilsByDruid.getConnection();
            return queryRunner.query(connection, sql, new BeanHandler<T>(clazz), parameters);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtilsByDruid.close(null, null, connection);
        }
    }

    // 查询单行单列结果的通用方法
    public Object queryScalar(String sql, Object... parameters) {
        Connection connection = null;
        try {
            connection = JDBCUtilsByDruid.getConnection();
            return queryRunner.query(connection, sql, new ScalarHandler(), parameters);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtilsByDruid.close(null, null, connection);
        }
    }
}
