package qi.work.user.service;

import org.springframework.stereotype.Service;
import qi.work.user.entity.User;

/**
 * Created by Administrator on 2017/8/15.
 */
@Service("userServiceImpl")
public class UserServiceImpl implements UserService {

    @Override
    public int createUser(User user) {
        return 0;
    }
}
