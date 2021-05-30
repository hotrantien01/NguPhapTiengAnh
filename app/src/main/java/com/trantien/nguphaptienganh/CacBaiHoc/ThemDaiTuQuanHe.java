package com.trantien.nguphaptienganh.CacBaiHoc;

import com.trantien.nguphaptienganh.Model.BaiHoc;

import java.util.ArrayList;

public class ThemDaiTuQuanHe {
    ArrayList<BaiHoc> arrayList;

    public ThemDaiTuQuanHe(ArrayList<BaiHoc> arrayList) {
        this.arrayList = arrayList;
        add();
    }

    private void add() {
        arrayList.add(new BaiHoc("Đại từ quan hệ, trạng từ quan hệ", "Đại từ quan hệ Who, Which, Whose, Whom", "7.1"));
        arrayList.add(new BaiHoc("Rút gọn mệnh đề, lược bỏ mệnh đề", "Các cách tút gọn và lược bỏ mệnh đề quan hệ", "7.2"));
    }
}
