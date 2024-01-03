package com.jdbc.dao_.test;

import com.itheima.d7_extends.A;
import com.jdbc.dao_.dao.ActorDAO;
import com.jdbc.dao_.domain.Actor;
import org.junit.Test;

import java.util.List;

/**
 * ClassName: TestDAO
 * Package: com.jdbc.dao_.test
 * Description:
 *
 * @Author Null_jun
 * @Create 2024/1/3 20:23
 * @Version 1.0
 */
public class TestDAO {
    @Test
   public void testActorDAO() {
       // 测试ActorDAO 对actor表进行crud操作;
       ActorDAO actorDAO = new ActorDAO();
       // 1. 查询
       List<Actor> actors = actorDAO.queryMulti("select * from actor where id >= ?", Actor.class, 1);
       System.out.println("查询结果如下");
       for(Actor actor : actors) {
           System.out.println(actor);
       }
        // 2. 查询单行结果
        Actor actor = actorDAO.querySingle("select * from actor where id >= ?", Actor.class, 1);
        System.out.println("查询单行的结果是");
        System.out.println(actor);

        // 3. 查询单行单列
        Object o = actorDAO.queryScalar("select name from actor where id >= ?", 1);
        System.out.println("查询单行单列值");
        System.out.println(o);

        // 4. dml操作
        int rows = actorDAO.update("insert into actor values(null, ?, ?, ?, ?)", "hkk", "男", "1999-05-17", "111");
        System.out.println(rows > 0 ? "执行成功" : "执行没有影响表");
    }
}
