package com.imust.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import com.imust.entity.Users;
@Mapper
public interface UserMapper {

    //添加信息
    @Insert("insert into User(name,phone,plate_num,password,createDate,stauts) values(#{name},#{phone},#{plate_num},#{password},SYSDATE(),0)")
    public void insertUsers(Users users);

    //删除信息
    @Delete("delete from User where id=#{id}")
    public void deleteUserById(int id);
