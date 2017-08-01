package util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;

/**
 * @Author: Junze
 * @Date: Create in 16:42 2017/6/2
 * @Description:
 */
public class MybatisUtil {

    private MybatisUtil(){}
    private static ThreadLocal<SqlSession> threadLocal = new ThreadLocal<>();
    private static SqlSessionFactory sqlSessionFactory;

    static {
        try {
            Reader reader = Resources.getResourceAsReader("mybatis.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public static SqlSession getSqlSession(){
        SqlSession sqlSession = threadLocal.get();
        if (sqlSession == null){
            sqlSession = sqlSessionFactory.openSession();
            threadLocal.set(sqlSession);
        }
        return sqlSession;
    }

    public static void closeSqlSession(){
        SqlSession sqlSession = threadLocal.get();
        if (sqlSession != null){
            sqlSession.close();
            threadLocal.remove();
        }

    }


    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        Connection con = sqlSession.getConnection();
        System.out.println(con);

    }

}
