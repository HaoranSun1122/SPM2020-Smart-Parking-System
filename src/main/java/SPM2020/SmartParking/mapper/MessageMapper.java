package com.imust.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.imust.entity.Message;
@Mapper
public interface MessageMapper {

    //添加信息
    @Insert("insert into Message(content,createDate,user_id,user_name) values(#{content},SYSDATE(),#{user_id},#{user_name})")
    public void insertMessage(Message message);