package com.newer.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private Integer  uid  ;
    private String uname;
    private String upwd  ;
    private String uphone  ;
    private Integer ustate  ;
    private Date urtime  ;
    private String uremark  ;
    private String spare  ;
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

    public Date getUrtime() {
        return urtime;
    }

    public void setUrtime(Date urtime) {
        this.urtime = urtime;
    }

    public String getUremark() {
        return uremark;
    }

    public void setUremark(String uremark) {
        this.uremark = uremark;
    }

    public String getSpare() {
        return spare;
    }

    public void setSpare(String spare) {
        this.spare = spare;
    }

    public Integer getUpermission() {
        return upermission;
    }

    public void setUpermission(Integer upermission) {
        this.upermission = upermission;
    }
}
