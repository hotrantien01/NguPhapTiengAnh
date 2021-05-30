package com.trantien.nguphaptienganh.CacBaiHoc;

import com.trantien.nguphaptienganh.Model.BaiHoc;

import java.util.ArrayList;

public class ThemCauSoSanh {
    ArrayList<BaiHoc> arrayList;

    public ThemCauSoSanh(ArrayList<BaiHoc> arrayList) {
        this.arrayList = arrayList;
        add();
    }

    private void add() {
        arrayList.add(new BaiHoc("So sánh bằng", "So sánh bằng", "6.1"));
        arrayList.add(new BaiHoc("So sánh hơn", "So sánh hơn", "6.2"));
        arrayList.add(new BaiHoc("So sánh hơn nhất", "So sánh hơn nhất", "6.3"));
        arrayList.add(new BaiHoc("So sánh kép", "So sánh kép", "6.4"));
        arrayList.add(new BaiHoc("So sánh hơn gấp nhiều lần", "So sánh hơn gấp nhiều lần", "6.5"));
        arrayList.add(new BaiHoc("Bảng so sánh tính từ, trạng từ bất quy tắc", "Bảng so sánh tính từ, trạng từ bất quy tắc", "6.6"));
    }
}
