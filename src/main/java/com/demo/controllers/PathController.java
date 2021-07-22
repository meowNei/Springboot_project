package com.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @Author Zeng Jie
 * @CreateTime 2021/7/22 10:13
 * @Version 1.0.0
 */

@Controller
public class PathController {

    @RequestMapping("/")
    public String index() {
        return "login";
    }

}
