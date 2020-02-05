package org.zsl.Proxcy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zsl.proxy.classic.CustomerDao;
import org.zsl.proxy.classic.OrderDao;

/**
 * @author zsl
 * @date 2020/2/5
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:springConfig/applicationContext-test.xml")
public class DemoTest1 {

    @Autowired
    @Qualifier("orderDaoProxy")
    private OrderDao orderDao;

    @Autowired
    @Qualifier("customerDaoProxy")
    private CustomerDao customerDao;

    @Test
    public void test1(){
        orderDao.add();
        orderDao.delete();
        orderDao.find();
        orderDao.update();
    }

    @Test
    public void test2(){
        customerDao.add();
        customerDao.delete();
        customerDao.find();
        customerDao.update();
    }
}
