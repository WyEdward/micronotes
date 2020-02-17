package cn.wyedward.dao;

import cn.wyedward.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    /**
     * 根据用户名删除类别
     * @param userName
     * @return
     */
    int deleteByPrimaryKey(String userName);

    /**
     * 插入类别
     * @param record
     * @return
     */
    int insert(User record);

    /**
     * 有选择性的插入类别
     * @param record
     * @return
     */
    int insertSelective(User record);

    /**
     * 根据用户名查找类别
     * @param userName
     * @return
     */
    User selectByPrimaryKey(String userName);

    /**
     * 有选择性的更新类别
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * 更新类别
     * @param record
     * @return
     */
    int updateByPrimaryKey(User record);
}