package org.zsl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zsl.mapper.ZslOrdersMapper;
import org.zsl.mapper.ZslUserMapper;
import org.zsl.po.ZslOrders;
import org.zsl.po.ZslOrdersCustom;
import org.zsl.po.ZslUser;
import org.zsl.service.TestGoods;

import java.util.List;

/**
 * @author zsl
 * @date 2020/2/7
 */
@Service
public class TestGoodsImpl implements TestGoods {

    @Autowired
    private ZslOrdersMapper zslOrdersMapper;

    @Autowired
    private ZslUserMapper zslUserMapper;

    @Override
    public List<ZslOrdersCustom> selectOrdersWithUser() {
        return zslOrdersMapper.selectOrdersWithUser();
    }

    @Override
    public List<ZslOrders> selectOrdersWithUserUsingResultMap() {
        return zslOrdersMapper.selectOrdersWithUserUsingResultMap();
    }

    @Override
    public List<ZslUser> selectOne2MoreByResultType() {
        return zslUserMapper.selectOne2MoreByResultMap();
    }

    @Override
    public List<ZslUser> selectOne2MoreByDifficult() {
        return zslUserMapper.selectOne2MoreByDifficult();
    }


}
