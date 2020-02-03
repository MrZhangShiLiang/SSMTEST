package org.zsl.mapper;

import org.zsl.po.TBloger;

public interface TBlogerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TBloger record);

    int insertSelective(TBloger record);

    TBloger selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TBloger record);

    int updateByPrimaryKey(TBloger record);
}