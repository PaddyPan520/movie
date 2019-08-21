package com.newer.mapper;

import com.newer.domain.User;
import org.apache.ibatis.annotations.*;

public interface UserMapper {
    @Insert("insert into user values(null,#{uname},#{upwd},#{uphone},#{ustate},#{urtime})" )
    int addUser(User user);
    @Results(value ={
            @Result(property = "uid",column = "uid",id = true),
            @Result(property = "uname",column = "uname"),
            @Result(property = "upwd",column = "upwd"),
            @Result(property = "uphone",column = "uphone"),
            @Result(property = "ustate",column = "ustate"),
            @Result(property = "urtime",column = "urtime") })
    @Select("select * from user where uname = #{uname} and upwd = #{upwd}")
    User loginUser(@Param("uname") String uname, @Param("upwd") String upwd);
}
//