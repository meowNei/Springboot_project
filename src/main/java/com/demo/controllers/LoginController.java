package com.demo.controllers;

import com.demo.service.ILoginService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * 登录和注销控制器
 * @Author Zeng Jie
 * @CreateTime 2021/7/22 11:37
 * @Version 1.0.0
 */
@Controller
@SessionAttributes({"user"})
public class LoginController {

    @Resource
    private ILoginService iloginService;

    @PostMapping("/login")
    public String login(Model model, String username, String password){

        System.out.println(username + password);
        try{
            String nextPath = iloginService.login(model, username, password);
            return nextPath;
        }catch (Exception e){
            e.printStackTrace();
        }
        return "error";
    }

    @GetMapping("/logout")
    public String logout(Model model, HttpSession session, SessionStatus sessionStatus){

        try {
            String nextPath = iloginService.logout(model, session, sessionStatus);
            return nextPath;
        }catch (Exception e){
            e.printStackTrace();
        }
        return "error";
    }
}
