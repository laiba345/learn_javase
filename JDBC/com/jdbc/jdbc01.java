package com.jdbc;
//import com.mysql.jdbc.Driver;
import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * ClassName: jdbc01
 * Package: com.jdbc
 * Description:
 *
 * @Author Null_jun
 * @Create 2023/12/27 16:22
 * @Version 1.0
 * 这是第一个jdbc程序, 完成简单操作
 */
public class jdbc01 {
    public static void main(String[] args) throws SQLException {
        /*
        * 前置工作: 在项目下创建一个文件夹比如libs
        * 将mysql.jar 拷贝到目录下,点击add to project... 加入到项目中
        * */
        // 1. 注册驱动
        Driver driver = new Driver(); // 创建driver对象
        // 2. 得到连接
        /*
        * 解释:
        * 1. jdbc:mysql:// 规定好表示协议,通过jdbc的方式连接mysql
        * 2. localhost 主机,也可以是ip地址
        * 3. 3306 表示mysql监听的端口
        * 4. hsp_db01 连接到mysql dbms的哪个数据库
        * 5. mysql的连接, 就是前面学过的一个socket连接
        * */
        // String url = "jdbc:mysql://localhost:3306/hsp_db01";
        // String url = "jdbc:mysql://localhost:3306/hsp_db01?serverTimezone=Asia/Shanghai";
        String url = "jdbc:mysql://localhost:3306/hsp_db01?serverTimezone=UTC&useSSL=false&useServerPrepStmts=true&characterEncoding=utf-8&useSSL=false";
        // 将用户名和密码放到Properties对象中
        Properties properties = new Properties();
        /*
        *  user和password是规定好的,后面的值根据实际情况来书写;
        * */
        properties.setProperty("user", "root"); // 用户
        properties.setProperty("password", "175511"); // 密码

        Connection connect = driver.connect(url, properties);

        // 3. 执行sql
        // String sql = "INSERT INTO actor VALUES(001, 'hk', '男', '1999-05-17', '110')";
        String sql = "INSERT INTO actor VALUES(002, 'zj', '男', '1998-07-27', '118')";
        // statement 表示用于执行静态SQL语句并返回其生成的结果的对象;
        Statement statement = connect.createStatement();
        int row = statement.executeUpdate(sql); // 如果是dml语句,返回的就是影响行数
        System.out.println(row > 0 ? "成功" : "失败");

        // 4. 关闭连接资源
        statement.close();
        connect.close();
    }
}
