package com.imust.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.imust.entity.Order;
@Mapper
public interface OrderMapper {


    @Select("select o.status,u.plate_num,c.price,o.code,o.createDate,o.id,o.total,u.name user_name,u.phone,c.name park_name from Orders o,User u,Park c where o.user_id=u.id and o.park_id=c.id")
    List<Order> findAllOrder();
	