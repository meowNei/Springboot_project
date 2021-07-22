package com.demo.service;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpSession;

/**
 * 登录注销服务接口
 * @Author Zeng Jie
 * @CreateTime 2021/7/22 11:18
 * @Version 1.0.0
 */

public interface ILoginService {
    /**
     * 登录
     * @param model
     * @param username
     * @param password
     * @return
     * @throws Exception
     */
    public String login(Model model, String username, String password) throws Exception;


    /**
     * 注销
     * @param model
     * @param session
     * @param sessionStatus
     * @return
     * @throws Exception
     */
    public String logout(Model model, HttpSession session,
                         SessionStatus sessionStatus) throws Exception;
}
