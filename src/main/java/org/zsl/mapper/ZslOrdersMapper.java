package org.zsl.mapper;

import org.zsl.po.ZslOrders;
import org.zsl.po.ZslOrdersCustom;
import org.zsl.po.ZslUser;

import java.util.List;

public interface ZslOrdersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ZslOrders record);

    int insertSelective(ZslOrders record);

    ZslOrders selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ZslOrders record);

    int updateByPrimaryKey(ZslOrders record);

    List<ZslOrdersCustom> selectOrdersWithUser();

    List<ZslOrders> selectOrdersWithUserUsingResultMap();


}