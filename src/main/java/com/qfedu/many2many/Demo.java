package com.qfedu.many2many;

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
    public static void ByXid(){
        SqlSession sqlSession = factory.openSession();
        XsDao mapper = sqlSession.getMapper(XsDao.class);
        Xs byXid = mapper.findByXid(1);
        System.out.println(byXid);
        sqlSession.commit();
        sqlSession.close();
    }
    public static void findByXid2(){
        SqlSession sqlSession = factory.openSession();
        XsDao mapper = sqlSession.getMapper(XsDao.class);
        Xs byXid2 = mapper.findByXid2(1);
        List<Ls> lsList = byXid2.getLsList();
        for (Ls ls : lsList) {
            System.out.println(ls);
        }
//        System.out.println(byXid2.getLsList());
        sqlSession.commit();
        sqlSession.close();
    }
    public static void findByLid(){
        SqlSession sqlSession = factory.openSession();
        LsDao mapper = sqlSession.getMapper(LsDao.class);
        Ls byLid = mapper.findByLid(1);
        List<Xs> xsList = byLid.getXsList();
        System.out.println(xsList);
    }

    public static void main(String[] args) {
        findByLid();

    }
}
