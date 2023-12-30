package com.jdbc.myjdbc;

/**
 * ClassName: TestJDBC
 * Package: com.jdbc.myjdbc
 * Description:
 *
 * @Author Null_jun
 * @Create 2023/12/26 20:43
 * @Version 1.0
 */
public class TestJDBC {
    public static void main(String[] args) {
        // 完成对mysql的操作
        JdbcInterface jdbcInterface = new MysqlJdbcImpl();
        jdbcInterface.getConnection(); // 通过接口来调用实现类[动态绑定操作]
        jdbcInterface.crud();
        jdbcInterface.close();

        System.out.println("------------------");
        // 完成对mysql的操作
        JdbcInterface jdbcInterface2 = new OracleJdbcImpl();
        jdbcInterface2.getConnection(); // 通过接口来调用实现类[动态绑定操作]
        jdbcInterface2.crud();
        jdbcInterface2.close();
    }
}
