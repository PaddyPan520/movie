package com.newer.domain;

import java.io.Serializable;
import java.util.Date;

public class Movieinfo implements Serializable {
    private Integer mid;
    private String mname;
    private String minfo;
    private String mclassify;
    private String mpicture;
    private Double mprice;
    private String mactor;
    private String mdirector;
    private Date mrdate;
    private Integer mtstatus;
    private Integer mtime;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMinfo() {
        return minfo;
    }

    public void setMinfo(String minfo) {
        this.minfo = minfo;
    }

    public String getMclassify() {
        return mclassify;
    }

    public void setMclassify(String mclassify) {
        this.mclassify = mclassify;
    }

    public String getMpicture() {
        return mpicture;
    }

    public void setMpicture(String mpicture) {
        this.mpicture = mpicture;
    }

    public Double getMprice() {
        return mprice;
    }

    public void setMprice(Double mprice) {
        this.mprice = mprice;
    }

    public String getMactor() {
        return mactor;
    }

    public void setMactor(String mactor) {
        this.mactor = mactor;
    }

    public String getMdirector() {
        return mdirector;
    }

    public void setMdirector(String mdirector) {
        this.mdirector = mdirector;
    }

    public Date getMrdate() {
        return mrdate;
    }

    public void setMrdate(Date mrdate) {
        this.mrdate = mrdate;
    }

    public Integer getMtstatus() {
        return mtstatus;
    }

    public void setMtstatus(Integer mtstatus) {
        this.mtstatus = mtstatus;
    }

    public Integer getMtime() {
        return mtime;
    }

    public void setMtime(Integer mtime) {
        this.mtime = mtime;
    }
}
