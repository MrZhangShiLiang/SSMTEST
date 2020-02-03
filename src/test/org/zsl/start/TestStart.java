package org.zsl.start;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

import java.util.Arrays;

/**
 * @author zsl
 * @date 2020/2/3
 */
public class TestStart {

    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:springConfig/applicationContext-dao.xml");
        String[] names = applicationContext.getBeanDefinitionNames();
        Arrays.stream(names).forEach(System.out::println);
//        ApplicationContext context = new XmlWebApplicationContext();
//        ((XmlWebApplicationContext) context).setConfigLocation("classpath:springConfig/applicationContext-dao.xml");
//        String[] beanDefinitionNames = context.getBeanDefinitionNames();
//        Arrays.stream(beanDefinitionNames).forEach(System.out::println);
    }
}
