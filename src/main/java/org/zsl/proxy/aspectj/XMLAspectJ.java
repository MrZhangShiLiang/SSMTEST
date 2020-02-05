package org.zsl.proxy.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author zsl
 * @date 2020/2/5
 */
public class XMLAspectJ {

    public void before(){
        System.out.println("前增强");
    }

    public void afterReturning(Object returning){
        System.out.println("后增强，返回值信息为"+returning);
    }

    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("钱增强");
        Object o = proceedingJoinPoint.proceed();
        System.out.println("后增强");
        return o;
    }

    public void afterThrowing(Throwable e){
        System.out.println("出bug啦，信息为："+e.getMessage());
    }

}
