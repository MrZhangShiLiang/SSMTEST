package org.zsl.proxy.classic.impl;

import org.zsl.proxy.classic.OrderDao;

/**
 * @author zsl
 * @date 2020/2/5
 */
public class OrderDaoImpl implements OrderDao {
    @Override
    public void add() {
        System.out.println("add. order");
    }

    @Override
    public void delete() {
        System.out.println("delete. order");
    }

    @Override
    public void find() {
        System.out.println("find. order");
    }

    @Override
    public void update() {
        System.out.println("update. order");
    }
}
