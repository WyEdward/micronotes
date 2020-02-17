package cn.wyedward.shiro;

import cn.wyedward.dao.PermissionMapper;
import cn.wyedward.dao.RoleMapper;
import cn.wyedward.dao.UserMapper;
import cn.wyedward.domain.Permission;
import cn.wyedward.domain.Role;
import cn.wyedward.domain.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;


public class ShiroRealm extends AuthorizingRealm{
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private PermissionMapper permissionMapper;
    /**
     * 角色和权限验证
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        User user = (User) SecurityUtils.getSubject().getPrincipal();
        String userName = user.getUserName();
        System.out.println("用户" + userName + "获取权限-----ShiroRealm.doGetAuthorizationInfo");
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        //获取用户角色集
        List<Role> roleList = roleMapper.findByUserName(userName);
        HashSet<String> roleSet = new HashSet<>();
        for (Role r : roleList) {
            roleSet.add(r.getRoleName());
        }
        simpleAuthorizationInfo.setRoles(roleSet);
        //获取用户权限集
        List<Permission> permissionList = permissionMapper.findByUserName(userName);
        HashSet<String> permissionSet = new HashSet<>();
        for (Permission p : permissionList) {
            permissionSet.add(p.getPermissionName());
        }
        simpleAuthorizationInfo.setStringPermissions(permissionSet);

        System.out.println(roleSet);
        System.out.println(permissionSet);
        return simpleAuthorizationInfo;

    }


    /**
     * 登录验证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String username =(String)authenticationToken.getPrincipal();
        String password = new String((char[]) authenticationToken.getCredentials());
        System.out.println("用户" + username + "认证-----ShiroRealm.doGetAuthenticationInfo");
        User user = userMapper.selectByPrimaryKey(username);
        if(user == null){
            throw new UnknownAccountException("用户名或密码错误！");
        }
        if (!password.equals(user.getPassword())) {
            throw new IncorrectCredentialsException("用户名或密码错误！");
        }
        if (user.getStatus().equals("0")) {
            throw new LockedAccountException("账号已被锁定,请联系管理员！");
        }
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user, password, getName());
        return info;
    }
}
