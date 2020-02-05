package org.zsl.demo.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author zsl
 * @date 2020/2/5
 */
public class CglibProxy implements MethodInterceptor {
    private Prodcut prodcut ;

    public CglibProxy(Prodcut prodcut) {
        this.prodcut = prodcut;
    }

    public Prodcut createProxy(){
        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(prodcut.getClass());
        enhancer.setCallback(this);

        return (Prodcut) enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        if ("add".equals(method.getName()))
            System.out.println("cglib 日志记录------------");

        methodProxy.invokeSuper(o,objects);
        return null;
    }
}
