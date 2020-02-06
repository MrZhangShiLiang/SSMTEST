package org.zsl.mapper;

import org.zsl.po.ZslUser;

public interface ZslUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ZslUser record);

    int insertSelective(ZslUser record);

    ZslUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ZslUser record);

    int updateByPrimaryKey(ZslUser record);
}