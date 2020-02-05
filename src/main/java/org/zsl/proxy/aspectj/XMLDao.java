package org.zsl.proxy.aspectj;

/**
 * @author zsl
 * @date 2020/2/5
 */
public class XMLDao {
    public void add(){
        System.out.println("添加用户");
    }

    public Integer delete(){
        System.out.println("删除用户");
        return 1;
    }

    public void update(){
        System.out.println("修改用户");
        int id = 1/0;
    }

    public void find(){
        System.out.println("查找用户");
    }
}
