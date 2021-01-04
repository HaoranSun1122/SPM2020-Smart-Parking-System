package com.imust.entity;

import java.util.Date;

public class Message {
    private int id;
    private String content;
    private int user_id;
    private String user_name;
    private String answer;
    private int admin_id;
    private String admin_name;
    private Date createDate;
    private Date answerDate;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }