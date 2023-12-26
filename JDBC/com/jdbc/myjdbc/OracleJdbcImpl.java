package com.jdbc.myjdbc;

/**
 * ClassName: OracleJdbcImpl
 * Package: com.jdbc.myjdbc
 * Description:
 *
 * @Author Null_jun
 * @Create 2023/12/26 20:45
 * @Version 1.0
 */
public class OracleJdbcImpl implements JdbcInterface{
    @Override
    public Object getConnection() {
        System.out.println("得到Oracle连接");
        return null;
    }

    @Override
    public void crud() {
        System.out.println("对Oracle进行增删改查");
    }

    @Override
    public void close() {
        System.out.println("对Oracle进行关闭");
    }
}
