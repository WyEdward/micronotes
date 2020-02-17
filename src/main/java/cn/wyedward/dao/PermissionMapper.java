package cn.wyedward.dao;

import cn.wyedward.domain.Permission;
import cn.wyedward.domain.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PermissionMapper {
    int deleteByPrimaryKey(Integer permissionId);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(Integer permissionId);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);

    /**
     * 根据用户名查询权限集
     * @param userName
     * @return
     */
    List<Permission> findByUserName(String userName);
}