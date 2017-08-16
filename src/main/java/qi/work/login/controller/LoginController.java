package qi.work.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator.
 */
@Controller
@RequestMapping("login")
public class LoginController {

    @RequestMapping
    public String login(){

        return "login";
    }

    @RequestMapping("/check")
    public String checkLoginIn(HttpServletRequest request){
       String username= request.getParameter("username");
       String password=request.getParameter("password");

       //查数据库，如果查到数据  调用MD5加密对比密码
        //校验成功
        // 存Session
        return "";


    }
}