package org.zsl.mapper;

import org.zsl.po.ZslItems;

public interface ZslItemsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ZslItems record);

    int insertSelective(ZslItems record);

    ZslItems selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ZslItems record);

    int updateByPrimaryKey(ZslItems record);
}