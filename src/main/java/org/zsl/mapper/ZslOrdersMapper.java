package org.zsl.mapper;

import org.zsl.po.ZslOrders;

public interface ZslOrdersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ZslOrders record);

    int insertSelective(ZslOrders record);

    ZslOrders selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ZslOrders record);

    int updateByPrimaryKey(ZslOrders record);
}