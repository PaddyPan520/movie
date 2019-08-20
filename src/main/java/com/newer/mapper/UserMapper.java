package com.newer.mapper;

import com.newer.domain.User;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    @Select("insert into user values(null,#{uname},#{upwd},#{uphone},#{ustate},#{urtime},#{upermission})" )
    int addUser(User user);
}
