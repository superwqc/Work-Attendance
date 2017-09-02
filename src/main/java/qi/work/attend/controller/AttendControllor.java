package qi.work.attend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Qi on 2017/9/2.
 */
@Controller
@RequestMapping("attend")
public class AttendControllor {



    @RequestMapping
    public String toAttend(){
        return "attend";
    }
}
