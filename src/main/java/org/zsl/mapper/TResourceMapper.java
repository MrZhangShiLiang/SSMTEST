package org.zsl.mapper;

import org.zsl.po.TResource;

public interface TResourceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TResource record);

    int insertSelective(TResource record);

    TResource selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TResource record);

    int updateByPrimaryKey(TResource record);
}