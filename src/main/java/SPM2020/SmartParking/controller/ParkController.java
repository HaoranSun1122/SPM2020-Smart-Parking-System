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

    @RequestMapping("/car-select")
    public String getCarByKey(Model model) {
        List<Park> carList = parkService.getAll();
        model.addAttribute("carList",carList);
        model.addAttribute("carNum",carList.size());
        return "list";
    }

    @RequestMapping("/findCar")
    public String findCar(@RequestParam("status") int status,Model model) {
        model.addAttribute("status",status);
        if(status==-1) {
            List<Park> carList = parkService.getAll();
            model.addAttribute("carList",carList);
        }else {
            List<Park> carList = parkService.getAllByKey(status);
            model.addAttribute("carList",carList);
            model.addAttribute("carNum",carList.size());
        }
        return "list";
    }
    @RequestMapping("/detail")
    public String editCar(@RequestParam("id") int id,Model model){
        Park car = parkService.getById(id);
        model.addAttribute("car",car);
        return "detail";
    }