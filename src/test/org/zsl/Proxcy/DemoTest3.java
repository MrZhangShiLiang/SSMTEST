package org.zsl.Proxcy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zsl.proxy.aspectj.UserDao;
import org.zsl.proxy.classic.CustomerDao;
import org.zsl.proxy.classic.OrderDao;

/**
 * @author zsl
 * @date 2020/2/5
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:springConfig/applicationContext-test3.xml")
public class DemoTest3 {

    @Autowired
    private UserDao userDao;

    @Test
    public void test1(){
        userDao.add();
        userDao.delete();
        userDao.find();
        userDao.update();
    }


}
