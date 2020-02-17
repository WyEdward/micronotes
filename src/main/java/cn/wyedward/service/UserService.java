package cn.wyedward.service;

import cn.wyedward.domain.User;

public interface UserService {
    /**
     * 根据用户名查找用户
     * @param userName
     * @return
     */
    User selectByPrimaryKey(String userName);
}
