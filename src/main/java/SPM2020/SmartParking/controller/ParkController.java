package com.imust.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.imust.entity.Park;
import com.imust.entity.Order;
import com.imust.entity.Users;
import com.imust.service.ParkService;
import com.imust.service.UserService;
import com.imust.service.OrderService;

@Controller
@RequestMapping("/car")
public class ParkController {
    @Autowired
    private ParkService parkService;

    @Autowired
    private OrderService orderService;

    @Autowired
    private UserService userService;