package org.zsl.service;

import org.zsl.po.ZslOrders;
import org.zsl.po.ZslOrdersCustom;
import org.zsl.po.ZslUser;

import java.util.List;

/**
 * @author ZSL
 * @date 2020 2 7
 * @描述 商品订单测试
 */
public interface TestGoods {
    //一个订单只属于一个用户 一对一  查询订单顺便查询该订单的用户信息
    List<ZslOrdersCustom> selectOrdersWithUser();

    List<ZslOrders> selectOrdersWithUserUsingResultMap();

    List<ZslUser> selectOne2MoreByResultType();

    List<ZslUser> selectOne2MoreByDifficult();
}
