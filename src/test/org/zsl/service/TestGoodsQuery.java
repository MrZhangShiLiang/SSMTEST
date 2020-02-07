package org.zsl.service;

import com.sun.media.sound.SoftTuning;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zsl.po.*;

import java.util.List;

/**
 * @author zsl
 * @date 2020/2/6
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:springConfig/applicationContext-*.xml")
public class TestGoodsQuery {

    @Autowired
    private TestGoods testGoods;

    @Test
    public void test1(){
        List<ZslOrdersCustom> zslOrdersCustoms = testGoods.selectOrdersWithUser();
        System.out.println(zslOrdersCustoms);
        zslOrdersCustoms.forEach(zslOrdersCustom -> System.out.println(zslOrdersCustom.toString()));

        List<ZslOrders> zslOrders = testGoods.selectOrdersWithUserUsingResultMap();
        System.out.println(zslOrders);
        zslOrders.forEach(zslOrders1 -> System.out.println(zslOrders1.toString()));
    }

    @Test
    public void test2(){
        List<ZslUser> zslUsers = testGoods.selectOne2MoreByResultType();
        System.out.println(zslUsers);
        zslUsers.forEach(zslUser -> System.out.println(zslUser.toString()));
    }

    @Test
    public void test3(){
        List<ZslUser> zslUsers = testGoods.selectOne2MoreByDifficult();
        System.out.println(zslUsers.size());
        System.out.println(zslUsers);
    }
}
