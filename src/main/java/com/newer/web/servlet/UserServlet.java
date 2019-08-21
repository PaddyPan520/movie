package com.newer.web.servlet;

import com.newer.domain.Admin;
import com.newer.domain.User;
import com.newer.service.UserService;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

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
        }else if("login".equals(action)){
            loginUser(req,resp);
        }else if("adminlogin".equals(action)){
            adminlogin(req,resp);
        }
    }

    private void adminlogin(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter out=resp.getWriter();
        String aname = req.getParameter("uname");
        String apwd = req.getParameter("upwd");
        System.out.println(aname+"  "+apwd);
        Admin admin = userService.loginAdmin(aname,apwd);
        if(admin==null){
            out.print("账号或密码错误");
        }else {
            out.print("登陆成功");
        }
        out.close();
    }


//        public void sendSms(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//            PrintWriter out=resp.getWriter();
//            String number = req.getParameter("uphone");
//            String da = "";
//            try {
//                JSONObject json = null;
//                //生成6位验证码
//                String verifyCode = String.valueOf(new Random().nextInt(899999) + 100000);
//                //发送短信
//                ZhenziSmsClient client = new ZhenziSmsClient("https://sms_developer.zhenzikj.com","102420","dd60da5c-6ea2-4ed9-8596-46ff8ddcbe2d");
//                String result = client.send(number, "您的验证码为:" + verifyCode + "，该码有效期为5分钟，该码只能使用一次！【短信签名】");
//                json = JSONObject.fromObject(result);
//                if(json.getInt("code") != 0) {//发送短信失败
//                    da = "fail";
//                }
//                // 将认证码存入SESSION
//                req.getSession().setAttribute("verifyCode", verifyCode);
//                req.getSession().setAttribute("createTime", System.currentTimeMillis());
//                da = "success";
//                out.print(da);
//                out.close();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//
//        }

    private void loginUser(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter out=resp.getWriter();
        String uname = req.getParameter("uname");
        String upwd = req.getParameter("upwd");
        User user = userService.loginUser(uname,upwd);
        if(user==null){
            out.print("账号或密码错误");
        }else {
            out.print("登陆成功");
        }
    }


    private void addUser(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter out=resp.getWriter();
        String name = req.getParameter("uname");
        String upwd = req.getParameter("upwd");
        String uphone = req.getParameter("uphone");
        SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date utilDate=new Date();
        java.sql.Date sqlDate=new java.sql.Date(utilDate.getTime());
        User user = new User();
        user.setUname(name);
        user.setUpwd(upwd);
        user.setUphone(uphone);
        user.setUrtime(sqlDate);
        user.setUstate(1);
            int rows =  userService.addUser(user);
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
