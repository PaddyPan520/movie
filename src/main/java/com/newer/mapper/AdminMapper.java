package com.newer.mapper;

import com.newer.domain.Admin;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface AdminMapper {
    @Results(value ={
            @Result(property = "aid",column = "aid",id = true),
            @Result(property = "aname",column = "aname"),
            @Result(property = "apwd",column = "apwd")})
    @Select("select * from admin where aname=#{aname} and apwd=#{apwd}")
    Admin loginAdmin(@Param("aname") String aname, @Param("apwd") String apwd);
}
