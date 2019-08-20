package com.newer.domain;

import java.io.Serializable;
import java.sql.Date;

public class User implements Serializable {
    private Integer  uid  ;
    private String uname;
    private String upwd  ;
    private String uphone  ;
    private Integer ustate  ;
    private Date urtime  ;


    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone;
    }

    public Integer getUstate() {
        return ustate;
    }

    public void setUstate(Integer ustate) {
        this.ustate = ustate;
    }

    public Date getUrtime() {
        return urtime;
    }

    public void setUrtime(Date urtime) {
        this.urtime = urtime;
    }


}
