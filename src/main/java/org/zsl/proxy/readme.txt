该文件夹下的类用于传统spring aop横向抽取的使用


AOP:不是由Spring定义.AOP联盟的组织定义.
Spring中的通知:(增强代码)
前置通知 org.springframework.aop.MethodBeforeAdvice
* 在目标方法执行前实施增强
后置通知 org.springframework.aop.AfterReturningAdvice
* 在目标方法执行后实施增强
环绕通知 org.aopalliance.intercept.MethodInterceptor
* 在目标方法执行前后实施增强
异常抛出通知 org.springframework.aop.ThrowsAdvice
* 在方法抛出异常后实施增强
引介通知 org.springframework.aop.IntroductionInterceptor(课程不讲.)
* 在目标类中添加一些新的方法和属性
