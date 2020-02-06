package org.zsl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zsl.mapper.TBlogMapper;
import org.zsl.po.TBlog;
import org.zsl.po.TBlogVo;
import org.zsl.service.TBlogService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zsl
 * @date 2020/2/6
 */
@Service
public class TBlogServiceImpl implements TBlogService {

    @Autowired
    private TBlogMapper tBlogMapper;

    @Override
    public List<TBlog> selectByTitle(String title) {
        return tBlogMapper.selectByTitle(title);
    }

    @Override
    public int selectCountByTitle(TBlogVo tBlogVo) {
        return tBlogMapper.selectCountByTitle(tBlogVo);
    }

    @Override
    public List<TBlog> selectListByIds(String ids) {
        ArrayList<Integer> idList =new ArrayList<>();
        Arrays.stream(ids.split("~")).forEach(id->idList.add(Integer.parseInt(id)));
        return tBlogMapper.selectListByIds(idList);
    }

    @Override
    public List<TBlog> selectBlogWithType() {
        return tBlogMapper.selectBlogWithType();
    }


}
