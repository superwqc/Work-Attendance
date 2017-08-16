package qi.work.common.utils;

import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Administrator.
 */
public class SecurityUtils {

    public String encrptyPassworrd(String password) throws NoSuchAlgorithmException, UnsupportedEncodingException {

        MessageDigest md5=MessageDigest.getInstance("MD5");
        BASE64Encoder base64Encoder=new BASE64Encoder();
        String result=base64Encoder.encode(md5.digest(password.getBytes("utf-8")));
        return  result;
    }

    public boolean checkPassword(String inputPwd,String dbPwd ) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        String result=encrptyPassworrd(inputPwd);
        if (result.equals(dbPwd)){
            return true;
        }
        else{
            return false;
        }
    }

}
