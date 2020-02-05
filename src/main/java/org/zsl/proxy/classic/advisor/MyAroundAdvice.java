package org.zsl.proxy.classic.advisor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author zsl
 * @date 2020/2/5
 */
public class MyAroundAdvice implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("环绕前");
        Object o = methodInvocation.proceed();
        System.out.println("环绕后");
        return o;
    }
}
