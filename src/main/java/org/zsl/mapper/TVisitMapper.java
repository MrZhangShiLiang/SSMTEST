package org.zsl.mapper;

import org.zsl.po.TVisit;

public interface TVisitMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TVisit record);

    int insertSelective(TVisit record);

    TVisit selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TVisit record);

    int updateByPrimaryKey(TVisit record);
}