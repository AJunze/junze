package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Junze
 * @Date: Create in 14:35 2017/6/6
 * @Description:
 */

@Controller
public class registerController {

    @RequestMapping(value = "/register")
    public String register(){
        return "register";
    }

}
