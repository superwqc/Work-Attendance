package qi.work.attend.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qi.work.attend.dao.AttendMapper;
import qi.work.attend.entity.Attend;

import java.text.SimpleDateFormat;


@Service("attendServiceImpl")
public class AttendServiceImpl implements AttendService{

    SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");


    private Log log= LogFactory.getLog(AttendServiceImpl.class);


    @Autowired
    private AttendMapper attendMapper;


    @Override
    public void signAttend(Attend attend) {
        attendMapper.insertSelective(attend);


    }
}
