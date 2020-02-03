package org.zsl.mapper;

import org.zsl.po.TBlogtype;

public interface TBlogtypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TBlogtype record);

    int insertSelective(TBlogtype record);

    TBlogtype selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TBlogtype record);

    int updateByPrimaryKey(TBlogtype record);
}