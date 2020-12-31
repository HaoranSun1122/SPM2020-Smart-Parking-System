package com.imust.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.imust.entity.Order;
import com.imust.entity.Park;
import com.imust.entity.Users;
import com.imust.service.OrderService;
import com.imust.service.ParkService;

@Controller
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @Autowired
    private ParkService parkService;
    //获取列表
    @RequestMapping("/showOrder")
    public String showOrder(Model model,HttpSession session) {
        Users user = (Users)session.getAttribute("LogUser");
        List<Order> orderList = orderService.getByUserId(user.getId());
        model.addAttribute("orderList",orderList);
        return "orderList";
    }