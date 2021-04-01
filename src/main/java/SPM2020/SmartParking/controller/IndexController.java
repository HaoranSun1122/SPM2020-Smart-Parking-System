package com.imust.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.imust.entity.Notice;
import com.imust.service.NoticeService;

@Controller
public class IndexController {

    @Autowired
    private NoticeService noticeService;

    @RequestMapping("/404")
    public String error() {
        return "404";
    }
    @RequestMapping("/index")
    public String index(Model model) {
        List<Notice> noticeList = noticeService.getAll();
        model.addAttribute("noticeList",noticeList);
        return "index";
    }

    @RequestMapping("/admin-index")
    public String index2(Model model) {
        return "admin/index";
    }

    @RequestMapping("/login")
    public String login() {
        return "admin/login";
    }

    @RequestMapping("/join")
    public String join() {
        return "join";
    }

    @RequestMapping("/welcome")

