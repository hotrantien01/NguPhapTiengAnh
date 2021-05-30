package com.trantien.nguphaptienganh.Model;

public class BaiHoc {
    String title;
    String des;
    String id;

    public BaiHoc(String title, String des, String id) {
        this.title = title;
        this.des = des;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getDes() {
        return des;
    }

    public String getId() {
        return id;
    }
}
