package cn.wyedward;

import cn.wyedward.dao.PermissionMapper;
import cn.wyedward.dao.RoleMapper;
import cn.wyedward.dao.UserMapper;
import cn.wyedward.domain.Permission;
import cn.wyedward.domain.Role;
import cn.wyedward.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest()
public class ApplicationTest {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private PermissionMapper permissionMapper;

    @Test
    public void testUser(){
        User user = userMapper.selectByPrimaryKey("wyedward");
        List<Role> roles = roleMapper.findByUserName(user.getUserName());
        List<Permission> permissions = permissionMapper.findByUserName(user.getUserName());
        System.out.println(roles);
        System.out.println(permissions);
    }

}
