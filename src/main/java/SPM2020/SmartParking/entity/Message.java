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
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getUser_name() {
        return user_name;
    }
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
    public String getAnswer() {
        return answer;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    public String getAdmin_name() {
        return admin_name;
    }