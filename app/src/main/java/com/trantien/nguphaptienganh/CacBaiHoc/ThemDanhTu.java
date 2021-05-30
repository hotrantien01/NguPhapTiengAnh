package com.trantien.nguphaptienganh.CacBaiHoc;

import com.trantien.nguphaptienganh.Model.BaiHoc;

import java.util.ArrayList;

public class ThemDanhTu {
    ArrayList<BaiHoc> arrayList;

    public ThemDanhTu(ArrayList<BaiHoc> arrayList) {
        this.arrayList = arrayList;
        add();
    }

    private void add() {
        arrayList.add(new BaiHoc("Các loại danh từ", "Danh từ riêng, danh từ chung, danh từ trừu tượng...", "17.1"));
        arrayList.add(new BaiHoc("Danh từ đếm được và không đếm được", "Cách sử dụng, một số danh từ đếm được và không đếm được", "17.2"));
        arrayList.add(new BaiHoc("Danh từ số ít và số nhiều", "Danh từ số ít và số nhiều", "17.3"));
        arrayList.add(new BaiHoc("Các danh từ bất quy tắc", "Tổng hợp các danh từ bất quy tắc", "17.4"));
    }
}
