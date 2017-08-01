package dao;

import model.Emp;
import model.TeTest2;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import util.MybatisUtil;

/**
 * @Author: Junze
 * @Date: Create in 16:53 2017/6/5
 * @Description:
 */
@Repository
public class EmpDao {
    @Autowired
    private SqlSessionFactory sqlSessionFactory;


    public int addEmp(Emp emp){

            SqlSession sqlSession = null;
            try {
                sqlSession = sqlSessionFactory.openSession();
                int i = sqlSession.insert("empNameSpace.add",emp);
                return i;
            }catch(Exception e){
                e.printStackTrace();
                sqlSession.rollback();
                throw e;
            }finally {
                MybatisUtil.closeSqlSession();
            }

    }
}
