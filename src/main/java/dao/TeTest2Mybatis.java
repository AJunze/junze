package dao;

import model.TeTest2;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.SqlSession;
import util.MybatisUtil;

import java.util.List;

/**
 * @Author: Junze
 * @Date: Create in 15:52 2017/6/2
 * @Description:
 */
public class TeTest2Mybatis {

    public void add(TeTest2 teTest2){
        SqlSession sqlSession = null;
        try {
        sqlSession = MybatisUtil.getSqlSession();
        int i = sqlSession.insert("test.add");
        System.out.println(i);
        sqlSession.commit();

        }catch(Exception e){
            e.printStackTrace();
            sqlSession.rollback();
            throw e;
        }finally {
            MybatisUtil.closeSqlSession();
        }
    }

    public void add2(TeTest2 teTest2){
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtil.getSqlSession();
            int i = sqlSession.insert("test.add2",teTest2);
            System.out.println(i);
            sqlSession.commit();

        }catch(Exception e){
            e.printStackTrace();
            sqlSession.rollback();
            throw e;
        }finally {
            MybatisUtil.closeSqlSession();
        }
    }

    public TeTest2 findById(Integer id){

        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtil.getSqlSession();
            TeTest2 teTest2 = sqlSession.selectOne("test.select", id);
            return teTest2;
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
            throw e;
        }finally {
            MybatisUtil.closeSqlSession();
        }
    }

    public List<TeTest2> findAll(){
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtil.getSqlSession();
            List<TeTest2> teTest2List = sqlSession.selectList("test.selectAll");
            return teTest2List;
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
            throw e;
        }finally {
            MybatisUtil.closeSqlSession();
        }
    }

    public void update(TeTest2 teTest2){

        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtil.getSqlSession();
            int i = sqlSession.update("test.update", teTest2);
            System.out.println(i);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
            throw e;
        }finally {
            MybatisUtil.closeSqlSession();
        }
    }

    public void deleteById(Integer id){

        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtil.getSqlSession();
            int i = sqlSession.delete("test.delete",id);
            System.out.println(i);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
            throw e;
        }finally {
            MybatisUtil.closeSqlSession();
        }
    }






    public static void main(String[] args) {

        TeTest2Mybatis dao = new TeTest2Mybatis();
        TeTest2 teTest2 = new TeTest2();
        teTest2.setId(5);
        teTest2.setAge(11);
        teTest2.setBonus(11);
        teTest2.setDept(11);
        teTest2.setName("test update");
        teTest2.setSal(11);
        //dao.add(new TeTest2());
        //dao.add2(teTest2);

        //TeTest2 test2 = dao.findById(2);
        //System.out.println(test2);
        //List<TeTest2> all = dao.findAll();
        //all.forEach(System.out::println);
        //dao.update(teTest2);
        dao.deleteById(5);
    }
}
