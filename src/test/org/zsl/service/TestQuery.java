package org.zsl.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zsl.po.TBlog;

import java.util.List;

/**
 * @author zsl
 * @date 2020/2/6
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:springConfig/applicationContext-*.xml")
public class TestQuery {

    @Autowired
    private TBlogService tBlogService;

    @Test
    public void test1(){
        List<TBlog> tBlogs = tBlogService.selectBlogWithType();
        System.out.println("================");
        tBlogs.forEach(tBlog -> System.out.println(tBlog.toString()));
    }
}
