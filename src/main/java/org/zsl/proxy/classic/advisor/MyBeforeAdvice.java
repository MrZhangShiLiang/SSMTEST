package org.zsl.proxy.classic.advisor;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author zsl
 * @date 2020/2/5
 * 前置增强类
 */
public class MyBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("啦啦啦 前置增强");
//        method.invoke(o,objects);
    }
}
