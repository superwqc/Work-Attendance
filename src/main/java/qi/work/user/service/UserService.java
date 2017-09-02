package qi.work.user.service;

import qi.work.user.entity.User;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Administrator on 2017/8/15.
 */
public interface UserService {
    public void createUser(User user) throws UnsupportedEncodingException, NoSuchAlgorithmException;
    public User findUserByUserName(String username);
}
