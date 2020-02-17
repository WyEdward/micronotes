package cn.wyedward.dao;

import cn.wyedward.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(String userName);

    int insert(User record);

    int insertSelective(User record);

    /**
     * 根据用户名查找用户
     * @param userName
     * @return
     */
    User selectByPrimaryKey(String userName);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}