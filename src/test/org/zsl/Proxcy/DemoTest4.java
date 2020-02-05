package org.zsl.Proxcy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zsl.proxy.aspectj.UserDao;
import org.zsl.proxy.aspectj.XMLDao;

/**
 * @author zsl
 * @date 2020/2/5
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:springConfig/applicationContext-test4.xml")
public class DemoTest4 {

    @Autowired
    private XMLDao xmlDao;

    @Test
    public void test1(){
       xmlDao.add();
       xmlDao.delete();
       xmlDao.find();
       xmlDao.update();
    }


}
