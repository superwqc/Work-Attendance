package qi.work.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import qi.work.user.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;



    @RequestMapping("/index")
    public String user(){


        System.out.println("overgame");
        return "user";
    }
}
