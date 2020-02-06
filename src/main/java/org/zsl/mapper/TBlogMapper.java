package org.zsl.mapper;

import org.apache.ibatis.annotations.Param;
import org.zsl.po.TBlog;
import org.zsl.po.TBlogVo;

import java.util.ArrayList;
import java.util.List;

public interface TBlogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TBlog record);

    int insertSelective(TBlog record);

    TBlog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TBlog record);

    int updateByPrimaryKeyWithBLOBs(TBlog record);

    int updateByPrimaryKey(TBlog record);

    List<TBlog> selectByTitle(@Param("title") String title);

    int selectCountByTitle(TBlogVo tBlogVo);

    List<TBlog> selectListByIds(@Param("ids") ArrayList<Integer> ids);

    List<TBlog> selectBlogWithType();
}