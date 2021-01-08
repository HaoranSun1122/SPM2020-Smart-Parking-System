package com.imust.entity;

import java.util.Date;

public class Users {
    private int id;
    private String name;
    private String phone;
    private String plate_num;
    private String password;
    private Date createDate;
    private int stauts;
    private int point;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }