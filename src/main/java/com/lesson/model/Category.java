package com.lesson.model;

import java.util.ArrayList;
import java.util.List;

public class Category {

    int cid;
    String cname;

    public int getCid() {

        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public static int numberEstimated(int scale, double num){
        return (int)(Math.round(Math.pow(10, scale) * num) / Math.pow(10,scale));
    }
}
