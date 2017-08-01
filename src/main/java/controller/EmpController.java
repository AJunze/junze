package controller;

import model.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.intf.EmpService;


/**
 * @Author: Junze
 * @Date: Create in 10:26 2017/6/6
 * @Description:
 */
@Controller("EmpController")
@RequestMapping(value = "/emp")
public class EmpController {

    @Autowired
    private EmpService empService;

    @RequestMapping(value = "/registerConfirm")
    public String registerMethod(Emp emp){

        if (emp.getId()!=null){
            int register = empService.register(emp);
            if (register == 1){
                return "success";
            }
        }
        return "register";
    }
}
