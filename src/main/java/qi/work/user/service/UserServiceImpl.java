package qi.work.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import qi.work.user.dao.UserMapper;
import qi.work.user.entity.User;

/**
 *
 */
@Service("userServiceImpl")
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override

    public int createUser(User user) {

        return userMapper.insertSelective(user);
    }
}
