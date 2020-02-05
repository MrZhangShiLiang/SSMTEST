package org.zsl.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zsl.po.TBlackip;

import java.util.Arrays;
import java.util.Optional;

/**
 * @author zsl
 * @date 2020/2/3
 * Spring 集成的junit测试
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:springConfig/applicationContext-*.xml")
public class TestStart {

    @Autowired
    private TBlackipMapper tBlackipMapper;

    @Test
    public void test2(){
        //一般返回给前端的数据最好做一下判空处理
        TBlackip tBlackip = Optional.ofNullable(tBlackipMapper.selectByPrimaryKey(1)).orElse(new TBlackip());
        System.out.println(tBlackip);
    }

    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:springConfig/applicationContext-*.xml");
        String[] names = applicationContext.getBeanDefinitionNames();
        Arrays.stream(names).forEach(System.out::println);

        TBlackip tBlackip = tBlackipMapper.selectByPrimaryKey(1);
        System.out.println(Optional.ofNullable(tBlackip).orElse(new TBlackip()));
//        ApplicationContext context = new XmlWebApplicationContext();
//        ((XmlWebApplicationContext) context).setConfigLocation("classpath:springConfig/applicationContext-dao.xml");
//        String[] beanDefinitionNames = context.getBeanDefinitionNames();
//        Arrays.stream(beanDefinitionNames).forEach(System.out::println);
    }
}
