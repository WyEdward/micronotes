package cn.wyedward.controller;

import cn.wyedward.domain.User;
import cn.wyedward.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Api(value = "用户controller")
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

   /* @ApiOperation(value = "获取用户信息", notes = "根据用户名获取用户信息")
    @GetMapping("/{userName}")
    @ResponseBody
    public User selectByPrimaryKey(@PathVariable(value = "userName") String userName){
        User user = userService.selectByPrimaryKey(userName);
        return user;
    }*/

    @ApiOperation(value = "测试权限获取用户信息", notes = "测试权限获取用户信息")
    @RequiresPermissions("user:user")
    @GetMapping("/list")
    @ResponseBody
    public String userList(Model model) {
        //model.addAttribute("value", "获取用户信息");
        return "获取用户信息";
    }
    @ApiOperation(value = "测试权限添加用户信息", notes = "测试权限添加用户信息")
    @RequiresPermissions("user:add")
    @PostMapping("/add")
    @ResponseBody
    public String userAdd(Model model) {
        //model.addAttribute("value", "新增用户");
        return "新增用户";
    }
    @ApiOperation(value = "测试权限删除用户信息", notes = "测试权限删除用户信息")
    @RequiresPermissions("user:delete")
    @DeleteMapping("/delete")
    @ResponseBody
    public String userDelete(Model model) {
        //model.addAttribute("value", "删除用户");
        return "删除用户";
    }

}
