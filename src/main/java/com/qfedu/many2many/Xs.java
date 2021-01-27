package com.qfedu.many2many;

import java.util.List;

public class Xs {
    private int xid;
    private String xname;
    private List<Ls> lsList;

    public Xs(int xid, String xname, List<Ls> lsList) {
        this.xid = xid;
        this.xname = xname;
        this.lsList = lsList;
    }

    public Xs() {
    }

    public int getXid() {
        return xid;
    }

    public void setXid(int xid) {
        this.xid = xid;
    }

    public String getXname() {
        return xname;
    }

    public void setXname(String xname) {
        this.xname = xname;
    }

    public List<Ls> getLsList() {
        return lsList;
    }

    public void setLsList(List<Ls> lsList) {
        this.lsList = lsList;
    }

    @Override
    public String toString() {
        return "Xs{" +
                "xid=" + xid +
                ", xname='" + xname + '\'' +
                ", lsList=" + lsList +
                '}';
    }
}
