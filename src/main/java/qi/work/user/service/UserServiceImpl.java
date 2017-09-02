package qi.work.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import qi.work.common.utils.SecurityUtils;
import qi.work.user.dao.UserMapper;
import qi.work.user.entity.User;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 *
 */
@Service("userServiceImpl")
@Transactional
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    @Override
    public User findUserByUserName(String username){
        User user=userMapper.selectByUserName(username);
        return user;
    }



    @Override
    public void createUser(User user) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        user.setPassword(SecurityUtils.encrptyPassworrd(user.getPassword()));
        userMapper.insertSelective(user);
    }
}
