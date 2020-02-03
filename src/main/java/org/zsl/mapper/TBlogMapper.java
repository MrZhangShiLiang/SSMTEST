package org.zsl.mapper;

import org.zsl.po.TBlog;

public interface TBlogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TBlog record);

    int insertSelective(TBlog record);

    TBlog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TBlog record);

    int updateByPrimaryKeyWithBLOBs(TBlog record);

    int updateByPrimaryKey(TBlog record);
}