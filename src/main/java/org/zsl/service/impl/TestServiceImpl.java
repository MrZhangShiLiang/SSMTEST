package org.zsl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zsl.mapper.TBlackipMapper;
import org.zsl.po.TBlackip;
import org.zsl.service.TestService;

import java.util.Optional;

/**
 * @author zsl
 * @date 2020/2/3
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TBlackipMapper tBlackipMapper;

    @Override
    public TBlackip getBlackIpById(Integer id) {
        return  Optional.ofNullable(tBlackipMapper.selectByPrimaryKey(id)).orElse(new TBlackip());
    }
}
