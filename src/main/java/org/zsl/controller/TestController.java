package org.zsl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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

    @ResponseBody
    @RequestMapping("/hello/{id}")
    public String test1(@PathVariable("id") Integer id){
        return testService.getBlackIpById(id).toString();
    }
}
