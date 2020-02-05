package org.zsl.proxy.classic.impl;

import org.zsl.proxy.classic.CustomerDao;

/**
 * @author zsl
 * @date 2020/2/5
 */
public class CustomerImpl implements CustomerDao {
    @Override
    public void add() {
        System.out.println("add. Customer");
    }

    @Override
    public void delete() {
        System.out.println("delete. Customer");
    }

    @Override
    public void find() {
        System.out.println("find. Customer");
    }

    @Override
    public void update() {
        System.out.println("update. Customer");
    }
}
