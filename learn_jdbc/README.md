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