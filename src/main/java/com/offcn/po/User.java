package com.offcn.po;

import java.io.Serializable;

public class User implements Serializable {
    private Integer sid;
    private String sname;
    private String parent;
    private String sdesc;

    @Override
    public String toString() {
        return "User{" +
                "id=" + sid +
                ", sname='" + sname + '\'' +
                ", parent='" + parent + '\'' +
                ", sdesc='" + sdesc + '\'' +
                '}';
    }

    public Integer getId() {
        return sid;
    }

    public void setId(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getSdesc() {
        return sdesc;
    }

    public void setSdesc(String sdesc) {
        this.sdesc = sdesc;
    }
}
