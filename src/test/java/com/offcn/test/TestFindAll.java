package com.offcn.test;

import com.offcn.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import java.io.InputStream;
import java.util.List;

public class TestFindAll  {
    @Test
    public void test() throws Exception{
        //加载核心配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //获取工厂对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //获取对话对象
        SqlSession sqlSession = factory.openSession();
        //执行
        List<User> list = sqlSession.selectList("UserMapper.findAll");
        for (User user:list){
            System.out.println(user);
        }
        //释放资源
        sqlSession.close();
    }
}
