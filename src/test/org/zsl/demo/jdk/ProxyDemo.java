package org.zsl.demo.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zsl
 * @date 2020/2/5
 */
public class ProxyDemo implements InvocationHandler {
    private UserDao userDao;

    public ProxyDemo(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserDao createProxy(){
        UserDao o = (UserDao) Proxy.newProxyInstance(this.userDao.getClass().getClassLoader(),
                userDao.getClass().getInterfaces(), this);
        return o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if ("add".equals(method.getName())){
            //方法名为add时，进行增强
            System.out.println("add方法日志。。。。");
        }
        method.invoke(this.userDao,args);
        return null;
    }
}
