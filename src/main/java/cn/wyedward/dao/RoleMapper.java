package cn.wyedward.dao;

import cn.wyedward.domain.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoleMapper {
    /**
     * 根据id删除角色
     * @param roleId
     * @return
     */
    int deleteByPrimaryKey(Integer roleId);

    /**
     * 插入角色
     * @param record
     * @return
     */
    int insert(Role record);

    /**
     * 有判断性的插入
     * @param record
     * @return
     */
    int insertSelective(Role record);

    /**
     * 根据id查询角色信息
     * @param roleId
     * @return
     */
    Role selectByPrimaryKey(Integer roleId);

    /**
     * 有判断性的更新角色信息
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Role record);

    /**
     * 更新角色信息
     * @param record
     * @return
     */
    int updateByPrimaryKey(Role record);

    /**
     * 根据用户名查找用户角色集
     * @param userName
     * @return
     */
    List<Role> findByUserName(String userName);


}