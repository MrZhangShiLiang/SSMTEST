package org.zsl.proxy.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @author zsl
 * @date 2020/2/5
 * @Before 前置通知，相当于BeforeAdvice
 * * 就在方法之前执行.没有办法阻止目标方法执行的.
 * @AfterReturning 后置通知，相当于AfterReturningAdvice
 * * 后置通知,获得方法返回值.
 * @Around 环绕通知，相当于MethodInterceptor
 * * 在可以方法之前和之后来执行的,而且可以阻止目标方法的执行.
 * @AfterThrowing抛出通知，相当于ThrowAdvice
 * @After 最终final通知，不管是否异常，该通知都会执行
 * @DeclareParents 引介通知，相当于IntroductionInterceptor (不要求掌握)
 */
@Aspect
public class MyAspectJ {

    @Before("execution(* org.zsl.proxy.aspectj.UserDao.find(..))")
    public void before(){
        System.out.println("使用Spring的@Aspect方式进行aop");
    }

    @AfterReturning(value = "execution(* org.zsl.proxy.aspectj.UserDao.delete(..))",returning = "id")
    public void afterReturning(Object id){
        //注意方法的参数 类型为Object类型
        System.out.println("后置增强啦啦啦啦,方法返回参数为"+id);
    }


    @Around(value = "myPoint()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        // 注意方法的参数
        System.out.println("前增强");
        Object proceed = proceedingJoinPoint.proceed();
        System.out.println(proceed);
        System.out.println("后增强");
        return proceed;
    }

    @AfterThrowing(value = "execution(* org.zsl.proxy.aspectj.UserDao.add(..))",throwing = "e")
    public void throwsable(Throwable e){
        System.out.println("抛异常啦啦啦，异常信息为"+e.getMessage());

    }

    @Pointcut("execution(* org.zsl.proxy.aspectj.UserDao.update(..))")
    public void myPoint(){
        //该类没有实际意义，用于抽象重复使用的切点
    }
}
