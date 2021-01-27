package com.qfedu.one2many;

import java.util.List;

public class Yg {
    private int id;
    private String name;
    private int bid;
    private Bm bm;

    public Yg(int id, String name, int bid, Bm bm) {
        this.id = id;
        this.name = name;
        this.bid = bid;
        this.bm = bm;
    }

    public Yg() {
    }

    @Override
    public String toString() {
        return "Yg{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", bid=" + bid +
                ", bm=" + bm +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public Bm getBm() {
        return bm;
    }

    public void setBm(Bm bm) {
        this.bm = bm;
    }
}
