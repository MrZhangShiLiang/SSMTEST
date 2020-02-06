package org.zsl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zsl.po.TBlog;
import org.zsl.po.TBlogVo;
import org.zsl.service.TBlogService;
import org.zsl.service.TestService;

/**
 * @author zsl
 * @date 2020/2/3
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    @Autowired
    private TBlogService tBlogService;

    @ResponseBody
    @RequestMapping("/blog/{title}")
    public String getByTitle(@PathVariable("title") String title){
        System.out.println(title+"===============");
        StringBuilder sb = new StringBuilder();
        tBlogService.selectByTitle("%"+title+"%").forEach(tb->sb.append(tb.toString()));
        return sb.toString();
    }

    @ResponseBody
    @RequestMapping("/blogcount/{title}")
    public String getByTitleCount(@PathVariable("title") String title){
        TBlog tBlog = new TBlog();
        tBlog.setTitle("%"+title+"%");
        TBlogVo tBlogVo = new TBlogVo();
        tBlogVo.settBlog(tBlog);
        int countByTitle = tBlogService.selectCountByTitle(tBlogVo);
        System.out.println(countByTitle);
        return String.valueOf(countByTitle);
    }

    @ResponseBody
    @RequestMapping("/blogids/{title}")
    public String getByTitleByIds(@PathVariable("title") String title){
        System.out.println(title+"===============");
        StringBuilder sb = new StringBuilder();
        tBlogService.selectListByIds(title).forEach(tb->sb.append(tb.toString()));
        return sb.toString();
    }

    @ResponseBody
    @RequestMapping("/hello/{id}")
    public String test1(@PathVariable("id") Integer id){
        return testService.getBlackIpById(id).toString();
    }
}
