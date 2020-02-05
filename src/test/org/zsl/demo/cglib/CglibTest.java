package org.zsl.demo.cglib;

import org.junit.Test;

/**
 * @author zsl
 * @date 2020/2/5
 */
public class CglibTest {
    @Test
    public void test1(){
        Prodcut proxy = new CglibProxy(new Prodcut()).createProxy();
        proxy.add();
        proxy.update();

    }
}
