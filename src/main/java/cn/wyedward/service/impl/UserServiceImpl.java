package cn.wyedward.service.impl;

import cn.wyedward.dao.UserMapper;
import cn.wyedward.domain.User;
import cn.wyedward.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    /*@Override
    public User selectByPrimaryKey(String userName) {
        return userMapper.selectByPrimaryKey(userName);
    }*/
}
