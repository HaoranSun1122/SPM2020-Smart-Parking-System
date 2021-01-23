package com.imust.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.imust.entity.Park;
@Mapper
public interface ParkMapper {


    @Select("select * from Park")
    List<Park> findAllPark();

    @Select("select * from Park where  status = #{status}")
    List<Park> findAllParkByKey(@Param("status") int status);
