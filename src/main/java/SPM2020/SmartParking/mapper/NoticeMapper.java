package com.imust.entity;

import java.util.Date;

public class Notice {

    private int id;
    private String title;
    private String content;
    private String admin_name;
    private Date createDate;
    private int admin_id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }