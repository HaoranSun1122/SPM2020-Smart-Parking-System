package com.imust.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.imust.entity.Admin;
@Mapper
public interface AdminMapper {

    //添加信息
    @Insert("insert into ADMIN(name,password,createDate) values(#{name},#{password},SYSDATE())")
    public void insert(Admin admin);

    //删除信息
    @Delete("delete from ADMIN where id=#{id}")
    public void delete(int id);

    //修改
    @Update("update Admin set name=#{name},password=#{password} where id=#{id}")
    public void update(Admin admin);

