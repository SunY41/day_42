package com.qfedu.one2many;

import java.util.List;

public class Bm {
    private int bid;
    private String bname;
    private List<Yg> ygList;

    public Bm(int bid, String bname, List<Yg> ygList) {
        this.bid = bid;
        this.bname = bname;
        this.ygList = ygList;
    }

    public Bm() {
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public List<Yg> getYgList() {
        return ygList;
    }

    public void setYgList(List<Yg> ygList) {
        this.ygList = ygList;
    }

    @Override
    public String toString() {
        return "Bm{" +
                "bid=" + bid +
                ", bname='" + bname + '\'' +
                ", ygList=" + ygList +
                '}';
    }
}
