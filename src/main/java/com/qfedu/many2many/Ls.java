package com.qfedu.many2many;

import java.util.List;

public class Ls {
    private int lid;
    private String lname;
    private List<Xs> xsList;

    public Ls(int lid, String lname, List<Xs> xsList) {
        this.lid = lid;
        this.lname = lname;
        this.xsList = xsList;
    }

    public Ls() {
    }

    @Override
    public String toString() {
        return "Ls{" +
                "lid=" + lid +
                ", lname='" + lname + '\'' +
                ", xsList=" + xsList +
                '}';
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public List<Xs> getXsList() {
        return xsList;
    }

    public void setXsList(List<Xs> xsList) {
        this.xsList = xsList;
    }
}
