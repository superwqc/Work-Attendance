package qi.work.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import qi.work.common.utils.SecurityUtils;
import qi.work.user.entity.User;
import qi.work.user.service.UserService;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;


@Controller
@RequestMapping("login")
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping
    public String login(){

        return "login";
    }

    @RequestMapping("/check")
    @ResponseBody
    public String checkLoginIn(HttpServletRequest request) throws UnsupportedEncodingException, NoSuchAlgorithmException {
       String username= request.getParameter("username");
       String pwd= request.getParameter("password");


        //查数据库，如果查到数据，调用MD5加密对比密码
        User user=userService.findUserByUserName(username);
        if(user!=null){
            if (SecurityUtils.checkPassword(pwd,user.getPassword())){
                request.getSession().setAttribute("userinfo",user);
                return "login_succ";

            }else {
                return "login_fail";
            }


        }else {
            //校验成功，存Session，返回成功！
            //校验失败，返回登录页面
        }
        return "login_succ";


    }
    @RequestMapping("/register")
    @ResponseBody
    public String register(@RequestBody User user) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        userService.createUser(user);

        return "succ";
    }
}