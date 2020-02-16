package cn.wyedward.dao;

import cn.wyedward.domain.Type;

public interface TypeMapper {
    int deleteByPrimaryKey(Integer typeId);

    int insert(Type record);

    int insertSelective(Type record);

    Type selectByPrimaryKey(Integer typeId);

    int updateByPrimaryKeySelective(Type record);

    int updateByPrimaryKey(Type record);
}