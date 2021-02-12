package com.imust.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imust.entity.Admin;
import com.imust.mapper.AdminMapper;
@Service
public class AdminService {
    @Autowired
    private AdminMapper adminMapper;

    //登陆
    public Admin login(Admin admin) {
        List<Admin> list = adminMapper.login(admin);
        if(list.size()>0) {
            admin = list.get(0);
            return admin;
        }
        return null;
    }