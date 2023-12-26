package com.jdbc.myjdbc;

/**
 * ClassName: JdbcInterface
 * Package: com.jdbc.myjdbc
 * Description:
 *
 * @Author Null_jun
 * @Create 2023/12/26 20:37
 * @Version 1.0
 */
public interface JdbcInterface {
    // 连接
    public Object getConnection();
    // crud
    public void crud();
    // 关闭连接
    public void close();
}
