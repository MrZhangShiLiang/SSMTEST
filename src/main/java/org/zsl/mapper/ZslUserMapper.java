package org.zsl.mapper;

import org.zsl.po.ZslUser;

import java.util.List;

public interface ZslUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ZslUser record);

    int insertSelective(ZslUser record);

    ZslUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ZslUser record);

    int updateByPrimaryKey(ZslUser record);

    List<ZslUser> selectOne2MoreByResultMap();

    List<ZslUser> selectOne2MoreByDifficult();
}