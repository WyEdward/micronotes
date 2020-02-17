package cn.wyedward.controller;

import cn.wyedward.domain.ResponseBo;
import cn.wyedward.domain.User;
import cn.wyedward.utils.MD5Utils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Api(value = "用户登录Controller")
@Controller
public class LoginController {
    @ApiOperation(value = "用户登录", notes = "后台用户登录")
    @PostMapping("/login")
    @ResponseBody
    public ResponseBo login(String userName, String password, Boolean rememberMe){
        //密码MD5加密
        password = MD5Utils.encrypt(userName, password);
       // System.out.println(password);
        UsernamePasswordToken token = new UsernamePasswordToken(userName, password, rememberMe);
        //获取Subject对象
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(token);
            return ResponseBo.ok();
        } catch (UnknownAccountException e) {
            return ResponseBo.error(e.getMessage());
        } catch (IncorrectCredentialsException e) {
            return ResponseBo.error(e.getMessage());
        } catch (LockedAccountException e) {
            return ResponseBo.error(e.getMessage());
        } catch (AuthenticationException e) {
            return ResponseBo.error("认证失败！");
        }
    }

    @ApiOperation(value = "限制先登录", notes = "用户要先登录")
    @GetMapping("/")
    public String redirectIndex() {
        return "redirect:/index";
    }

    @ApiOperation(value = "登录成后获取用户信息", notes = "获取登录后用户信息")
    @GetMapping("/index")
    public String index(Model model) {
        // 登录成后，即可通过Subject获取登录的用户信息
        User user = (User) SecurityUtils.getSubject().getPrincipal();
        model.addAttribute("user", user);
        return "index";
    }

}
