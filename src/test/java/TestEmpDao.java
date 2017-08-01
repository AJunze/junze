import dao.EmpDao;
import model.Emp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: Junze
 * @Date: Create in 16:54 2017/6/5
 * @Description:
 */

/*@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/spring-mybatis.xml"})*/
public class TestEmpDao {
    /*@Autowired
    private EmpDao empDao;

    @Test
    public void testMybatis(){

        *//*ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"spring-mybatis.xml"});*//*

        empDao.addEmp(new Emp(8,"test02",20,"girl"));
    }


    @Test
    public void test(){
        EmpDao empDao = new EmpDao();
        empDao.addEmp(new Emp(1,"test01",10,"男"));

    }*/
}
