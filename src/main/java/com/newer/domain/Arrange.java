package com.newer.domain;

import java.io.Serializable;
import java.util.Date;

public class Arrange implements Serializable {
       private Integer aid;
       private Date starttime;
       private Date endtime;
       private Integer hnum;
       private String spare;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Integer getHnum() {
        return hnum;
    }

    public void setHnum(Integer hnum) {
        this.hnum = hnum;
    }

    public String getSpare() {
        return spare;
    }

    public void setSpare(String spare) {
        this.spare = spare;
    }
}
