package com.imust.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.imust.entity.Users;
import com.imust.service.UserService;

@Controller
@RequestMapping("/user")

public class UserController {
    @Autowired
    private UserService userService;

    //登陆
    @RequestMapping("/login")
    public String login(@ModelAttribute("users") Users users,HttpSession session,Model model) {

        Users user = userService.login(users);
        if(user!=null) {
            if(user.getStauts()==0) {
                session.setAttribute("LogUser", user);
                return "redirect:/index";
            }else {
                model.addAttribute("msg", "该用户已被停用");
            }
        }else {
            model.addAttribute("msg", "用户名或密码错误");
        }
        return "join";
    }