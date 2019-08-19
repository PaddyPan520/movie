package com.newer.domain;

import java.util.Date;

public class Order {
     private Integer oid;
    private Integer uid;
    private Date oderdate;
    private Date opaytime;
    private Integer hnum;
    private String hname;
    private Integer onum;
    private Double oaamount;
    private Integer snum;
    private Integer ostate;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Date getOderdate() {
        return oderdate;
    }

    public void setOderdate(Date oderdate) {
        this.oderdate = oderdate;
    }

    public Date getOpaytime() {
        return opaytime;
    }

    public void setOpaytime(Date opaytime) {
        this.opaytime = opaytime;
    }

    public Integer getHnum() {
        return hnum;
    }

    public void setHnum(Integer hnum) {
        this.hnum = hnum;
    }

    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname;
    }

    public Integer getOnum() {
        return onum;
    }

    public void setOnum(Integer onum) {
        this.onum = onum;
    }

    public Double getOaamount() {
        return oaamount;
    }

    public void setOaamount(Double oaamount) {
        this.oaamount = oaamount;
    }

    public Integer getSnum() {
        return snum;
    }

    public void setSnum(Integer snum) {
        this.snum = snum;
    }

    public Integer getOstate() {
        return ostate;
    }

    public void setOstate(Integer ostate) {
        this.ostate = ostate;
    }
}
