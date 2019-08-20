package com.newer.domain;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

public class User implements Serializable {
    private Integer  uid  ;
    private String uname;
    private String upwd  ;
    private String uphone  ;
    private Integer ustate  ;
    private Timestamp urtime  ;
    private Integer upermission ;

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

    public Timestamp getUrtime() {
        return urtime;
    }

    public void setUrtime(Timestamp urtime) {
        this.urtime = urtime;
    }

    public Integer getUpermission() {
        return upermission;
    }

    public void setUpermission(Integer upermission) {
        this.upermission = upermission;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", upwd='" + upwd + '\'' +
                ", uphone='" + uphone + '\'' +
                ", ustate=" + ustate +
                ", urtime=" + urtime +
                ", upermission=" + upermission +
                '}';
    }
}
