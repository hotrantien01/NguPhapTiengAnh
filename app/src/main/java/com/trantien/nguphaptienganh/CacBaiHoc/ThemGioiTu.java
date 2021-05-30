package com.trantien.nguphaptienganh.CacBaiHoc;

import com.trantien.nguphaptienganh.Model.BaiHoc;

import java.util.ArrayList;

public class ThemGioiTu {
    ArrayList<BaiHoc> arrayList;

    public ThemGioiTu(ArrayList<BaiHoc> arrayList) {
        this.arrayList = arrayList;
        add();
    }

    private void add() {
        arrayList.add(new BaiHoc("Cách dùng","Vị trí, cách dùng giới từ", "21.1"));
        arrayList.add(new BaiHoc("Các loại giới từ", "Các loại giới từ", "21.2"));
    }
}
