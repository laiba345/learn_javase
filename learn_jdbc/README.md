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
- 大大减少了编译次数,效率较高; 
7. PreparedStatement preparedStatement = connection.preparedStatement(sql);
- 上述代码表示实现了PreparedStatement接口的实现类的对象 
8. 执行select语句使用executeQuery, 执行dml语句使用executeUpdate; 
9. 通过预处理来DML语句来进行相关操作; 
10. Transaction_.java; 用于对事务的相关处理操作; 
11. Batch 包用于演示批处理操作; 

