package org.zsl.service;

import org.zsl.po.TBlog;
import org.zsl.po.TBlogVo;

import java.util.List;

public interface TBlogService {
    List<TBlog> selectByTitle(String title);

    int selectCountByTitle(TBlogVo tBlogVo);

    List<TBlog> selectListByIds(String ids);

    List<TBlog> selectBlogWithType();
}
