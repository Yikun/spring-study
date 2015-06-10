package com.springstudy.mybatis;

import java.io.Reader;
import java.util.Iterator;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class UserDaoTest {
    @Test
    public void userDaoTest() throws Exception
    {
        String resource = "com/springstudy/mybatis/MyBatis-Configuration.xml";
        Reader reader = Resources.getResourceAsReader(resource);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(reader);
        
        SqlSession session = factory.openSession();
        UserDao userDao = session.getMapper(UserDao.class);
        
        User user = new User();
        user.setUserName("admin");
        user.setPassword("123456");
        user.setComment("备注");
        
        userDao.insert(user);
        System.out.println("Record count："+userDao.countAll());
        
        List<User> users = userDao.selectAll();
        Iterator<User> iter = users.iterator();
        while(iter.hasNext()){
            User u = iter.next();
            System.out.println("Username: "+u.getUserName());
            System.out.println("Password："+u.getPassword());
            System.out.println("Commnet："+u.getComment());
        }
        
        user.setComment("修改后的备注");
        userDao.update(user);
        User u = userDao.findByUserName("admin");
        System.out.println("Commnet: " + u.getComment());
        
        userDao.delete("admin");
        System.out.println("Record count："+userDao.countAll());
        
        session.commit();
        session.close();
    }
}