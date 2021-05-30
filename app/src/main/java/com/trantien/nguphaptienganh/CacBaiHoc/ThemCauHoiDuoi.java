package com.trantien.nguphaptienganh.CacBaiHoc;

import com.trantien.nguphaptienganh.Model.BaiHoc;

import java.util.ArrayList;

public class ThemCauHoiDuoi {
    ArrayList<BaiHoc> arrayList;

    public ThemCauHoiDuoi(ArrayList<BaiHoc> arrayList) {
        this.arrayList = arrayList;
        add();
    }

    private void add() {
        arrayList.add(new BaiHoc("Công thức câu hỏi đuôi", "Tổng hợp công thức câu hỏi đuôi", "9.1"));
        arrayList.add(new BaiHoc("Các dạng đặc biệt", "Các dạng đặc biệt câu hỏi đuôi", "9.2"));
    }
}
