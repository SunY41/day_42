package com.qfedu.one2many;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class Demo {
    private static SqlSessionFactory factory = null;
    static {
        Reader resourceAsReader = null;
        try {
            resourceAsReader = Resources.getResourceAsReader("mybatis.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        factory = new SqlSessionFactoryBuilder().build(resourceAsReader);

    }
    public static void select () {
        SqlSession session = factory.openSession();
        BmDao mapper = session.getMapper(BmDao.class);
        Bm byId = mapper.findById(5);
        List<Yg> ygList = byId.getYgList();
        for (Yg yg : ygList) {
            System.out.println(yg);
        }

        session.commit();
        session.close();
    }
    public static void findById2(){
        SqlSession session = factory.openSession();
        BmDao mapper = session.getMapper(BmDao.class);
        Bm byId2 = mapper.findById2(2);
        System.out.println(byId2);
        session.commit();
        session.close();
    }
    public static void findByBid(){
        SqlSession session = factory.openSession();
        YgDao mapper = session.getMapper(YgDao.class);
        Yg byId = mapper.findByBid(4);
        System.out.println(byId);
        session.commit();
        session.close();
    }

    public static void main(String[] args) {
        findByBid();
    }
}