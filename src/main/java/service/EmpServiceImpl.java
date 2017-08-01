package service;

import dao.EmpDao;
import model.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.intf.EmpService;


/**
 * @Author: Junze
 * @Date: Create in 10:30 2017/6/6
 * @Description:
 */
@Service("empService")
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpDao empDao;
    @Override
    public int register(Emp emp){
        int i = empDao.addEmp(emp);
        return i;
    }
}
