package org.zsl.mapper;

import org.zsl.po.TBlackip;

public interface TBlackipMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TBlackip record);

    int insertSelective(TBlackip record);

    TBlackip selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TBlackip record);

    int updateByPrimaryKey(TBlackip record);
}