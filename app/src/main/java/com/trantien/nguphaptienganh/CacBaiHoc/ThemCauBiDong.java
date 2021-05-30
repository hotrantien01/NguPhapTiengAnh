package com.trantien.nguphaptienganh.CacBaiHoc;

import com.trantien.nguphaptienganh.Model.BaiHoc;

import java.util.ArrayList;

public class ThemCauBiDong {
    ArrayList<BaiHoc> arrayList;

    public ThemCauBiDong(ArrayList<BaiHoc> arrayList) {
        this.arrayList = arrayList;
        add();
    }

    private void add() {
        arrayList.add(new BaiHoc("Cấu trúc ngữ pháp", "Tổng  hợp cấu trúc ngữ pháp câu bị động", "2.1"));
        arrayList.add(new BaiHoc("Các trường hợp đặc biệt", "Các cấu trúc ngữ pháp đặc biệt của câu bị động", "2.2"));
    }
}
