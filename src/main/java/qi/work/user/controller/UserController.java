package qi.work.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import qi.work.user.entity.User;

@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping("/index")
    public String user(){

        User u=new User();
        u.setRealname("老王");
        u.setMobile("22222222222");

        return "user";
    }
}
