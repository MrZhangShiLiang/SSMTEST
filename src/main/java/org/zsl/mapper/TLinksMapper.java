package org.zsl.mapper;

import org.zsl.po.TLinks;

public interface TLinksMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TLinks record);

    int insertSelective(TLinks record);

    TLinks selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TLinks record);

    int updateByPrimaryKey(TLinks record);
}