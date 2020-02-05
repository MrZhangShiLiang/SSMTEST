package org.zsl.demo.jdk;

import org.junit.Test;

/**
 * @author zsl
 * @date 2020/2/5
 */
public class JDKProxy {
    @Test
    public void test1(){
        UserDao userDao = new UserDaoImpl();
        userDao.add();
        userDao.update();
    }

    @Test
    public void test2(){

        ProxyDemo proxyDemo = new ProxyDemo(new UserDaoImpl());
        UserDao proxy = proxyDemo.createProxy();
        proxy.add();
        proxy.update();
    }
}
