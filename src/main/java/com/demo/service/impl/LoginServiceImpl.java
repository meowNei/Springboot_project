package com.demo.service.impl;

import com.demo.database.data.User;
import com.demo.database.mapper.UserMapper;
import com.demo.service.ILoginService;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.support.SessionStatus;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * 登录和注销服务具体实现类
 * @Author Zeng Jie
 * @CreateTime 2021/7/22 11:23
 * @Version 1.0.0
 */
@Service
public class LoginServiceImpl implements ILoginService {

    @Resource
    private UserMapper userMapper;

    @Override
    public String login(Model model, String username, String password) throws Exception {

        User user = userMapper.queryByLogin(username, password);

        if(user !=null){
            model.addAttribute("user",user);
            return "index";
        }else{
            model.addAttribute("error","用户名或密码错误");
        }
        return "login";
    }

    @Override
    public String logout(Model model, HttpSession session,
                         SessionStatus sessionStatus) throws Exception {
        session.invalidate();
        sessionStatus.setComplete();
        return "redirect:/";
    }
}
