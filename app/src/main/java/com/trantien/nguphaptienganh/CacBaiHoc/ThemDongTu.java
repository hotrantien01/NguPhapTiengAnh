package com.trantien.nguphaptienganh.CacBaiHoc;

import com.trantien.nguphaptienganh.Model.BaiHoc;

import java.util.ArrayList;

public class ThemDongTu {
    ArrayList<BaiHoc> arrayList;

    public ThemDongTu(ArrayList<BaiHoc> arrayList) {
        this.arrayList = arrayList;
        add();
    }

    private void add() {
        arrayList.add(new BaiHoc("Động từ thiếu khuyết", "Cấu trúc, cách sử dụng", "18.1"));
        arrayList.add(new BaiHoc("Nội động từ và ngoại động từ", "Nội động từ, ngoại động từ, phân biệt", "18.2"));
    }
}
