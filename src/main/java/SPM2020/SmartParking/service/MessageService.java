package com.imust.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imust.entity.Message;
import com.imust.mapper.MessageMapper;

@Service
public class MessageService {

    @Autowired
    private MessageMapper messageMapper;

//通过id修改状态