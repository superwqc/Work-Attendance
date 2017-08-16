package qi.work.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import qi.work.user.dao.UserMapper;
import qi.work.user.entity.User;
import qi.work.user.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;



    @RequestMapping("/index")
    public String user(){

        User u=new User();

        u.setUname("man");
        u.setPassword("123");
        u.setRealname("老刘");
        u.setMobile("134444444444");
        userService.createUser(u);

        System.out.println("overgame");
        return "user";
    }
}
