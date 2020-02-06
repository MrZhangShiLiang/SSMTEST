package org.zsl.mapper;

import org.zsl.po.ZslOrderdetail;

public interface ZslOrderdetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ZslOrderdetail record);

    int insertSelective(ZslOrderdetail record);

    ZslOrderdetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ZslOrderdetail record);

    int updateByPrimaryKey(ZslOrderdetail record);
}