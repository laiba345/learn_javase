不同的数据库书写不同的类来实现jdbc统一接口; 

报错: Exception in thread "main" com.mysql.cj.jdbc.exceptions.CommunicationsException: Communications link failure
- 对于文件找不到的错误,一个很大的问题在于路径无法及时找到,可以直接书写 绝对路径; 
- idea中右键可以直接看到 绝对路径

JDBC连接数据库的流程
1. 注册驱动; 
2. 得到连接; 
3. 执行sql;
4. 关闭连接; 

注意⚠️: 
1. static{} 静态代码块,在类加载时,会执行一次;
2. 除了DML语句,别的方法会返回相应的结果集; 
3. 有些类名不要瞎弄;
4. Statement; 是一个接口, 用于执行静态SQL语句,并返回其生成的结果的对象;但是其存在SQL注入问题;
5. 书写拼接操作时, 先使用单引号在外面, 再使用双引号在里面, 最后里层放入两个++; '"++"'
- scanner 中的next方法, 当接收到空格或者' 就是表示结束
- 通过nextLine()方法, 可以直接通过回车来表示判断
6. PreparedStatement的预处理好处(编译;)
- 不再使用 + 拼接sql语句, 减少语法错误; 
- 有效的解决了sql注入问题;
  - sql注入问题: 是一种安全漏洞,允许攻击者通过在应用程序中输入字段中注入恶意的SQL代码来访问或修改数据库;
  - 这种漏洞通常出现在未经充分验证和过滤的用户输入中，比如表单、搜索框或URL参数。
  - 使用参数化查询(Prepared Statements);
    - 使用参数化查询或预编译语句来构建SQL查询,这样可以将用户输入作为参数传递给数据库,而不是将其直接插入到SQL语句中; 
- 大大减少了编译次数,效率较高; 
7. PreparedStatement preparedStatement = connection.preparedStatement(sql);
- 上述代码表示实现了PreparedStatement接口的实现类的对象 
8. **执行select语句使用executeQuery, 执行dml语句使用executeUpdate**; 
9. 通过预处理来DML语句来进行相关操作; 
10. Transaction_.java; 用于对事务的相关处理操作; 
11. Batch 包用于演示批处理操作;  
12. 连接的时候,其实底层是需要走socket连接的, 这是很耗费时间的操作; 
13. 数据库种类中,C3P0和Druid用的是最多的; 它们的使用都需要准备好对应的配置文件
14. C3P0和mychange这两个jar包是配合使用的;

15. ResultSet直接与ArrayList关联起来; 
16. 老韩自己土方法实现了一把; p28; 

17. 最终的实现案例 DAO
