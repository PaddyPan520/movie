package com.newer.service;

import com.newer.domain.Admin;
import com.newer.domain.User;
import com.newer.mapper.AdminMapper;
import com.newer.mapper.UserMapper;
import com.newer.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

public class UserService {
    private UserMapper userMapper;
    private SqlSession sqlSession;
    public UserService(){
        //初始化DeptMapper
        sqlSession= SqlSessionUtil.getSqlSession();
        userMapper=sqlSession.getMapper(UserMapper.class);
    }
    public int addUser(User user){
        int rows = userMapper.addUser(user);
        sqlSession.commit();
        return rows;
    }


    public void close(){
        if(sqlSession!=null){
            SqlSessionUtil.closeSqlSession(sqlSession);
        }
    }

    public User loginUser(String uname, String upwd) {
        User user = userMapper.loginUser(uname,upwd);
        return user;
    }

    public Admin loginAdmin(String aname, String apwd) {
        AdminMapper adminMapper =sqlSession.getMapper(AdminMapper.class);
        return adminMapper.loginAdmin(aname,apwd);
    }
}
