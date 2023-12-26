package com.jdbc.myjdbc;

/**
 * ClassName: MysqlJdbcImpl
 * Package: com.jdbc.myjdbc
 * Description:
 *
 * @Author Null_jun
 * @Create 2023/12/26 20:39
 * @Version 1.0
 * mysql数据库实现了jdbc接口;[模拟] mysql来操作
 */
public class MysqlJdbcImpl implements JdbcInterface{
    @Override
    public Object getConnection() {
        System.out.println("得到mysql连接");
        return null;
    }

    @Override
    public void crud() {
        System.out.println("完成mysql的增删改查");
    }

    @Override
    public void close() {
        System.out.println("关闭连接");
    }
}
