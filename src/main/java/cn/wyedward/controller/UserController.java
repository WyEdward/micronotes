package cn.wyedward.controller;

import cn.wyedward.domain.User;
import cn.wyedward.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Api(value = "用户controller")
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation(value = "获取用户信息", notes = "根据用户名获取用户信息")
    @GetMapping("/{userName}")
    @ResponseBody
    public User selectByPrimaryKey(@PathVariable(value = "userName") String userName){
        User user = userService.selectByPrimaryKey(userName);
        return user;
    }
}
