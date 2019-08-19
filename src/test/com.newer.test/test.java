package com.newer.test;

import com.newer.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

public class test {
    @Test
    public void test(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        Connection conn=sqlSession.getConnection();
        try {
            System.out.println(conn.getMetaData().getDatabaseProductName());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        SqlSessionUtil.closeSqlSession(sqlSession);
    }

}
