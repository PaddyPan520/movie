package com.newer.servlet;

import com.newer.domain.User;
import com.newer.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/users")
public class UserServlet extends HttpServlet {
    private UserService userService;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action=req.getParameter("action");
        if("add".equals(action)){
            addUser(req,resp);
        }
    }

    private void addUser(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter out=resp.getWriter();
        String name = req.getParameter("uname");
        String upwd = req.getParameter("upwd");
        String uphone = req.getParameter("uphone");
        Date date = new Date();
        String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
        Timestamp utime = Timestamp.valueOf(time);//把时间转换
        User user = new User();
        user.setUname(name);
        user.setUpwd(upwd);
        user.setUphone(uphone);
        user.setUrtime(utime);
        user.setUstate(1);
        user.setUpermission(0);
        System.out.println();
        int rows =  userService.addUser(user);
        System.out.println(rows);
        if(rows>0){
            out.print(rows);
        }
        out.close();
    }

    @Override
    public void destroy() {
       userService.close();
    }

    @Override
    public void init() throws ServletException {
      userService = new UserService();
    }
}
