package org.zsl.mapper;

import org.zsl.po.TLog;

public interface TLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TLog record);

    int insertSelective(TLog record);

    TLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TLog record);

    int updateByPrimaryKey(TLog record);
}