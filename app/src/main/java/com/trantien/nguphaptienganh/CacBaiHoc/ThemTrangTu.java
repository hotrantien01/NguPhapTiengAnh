package com.trantien.nguphaptienganh.CacBaiHoc;

import com.trantien.nguphaptienganh.Model.BaiHoc;

import java.util.ArrayList;

public class ThemTrangTu {
    ArrayList<BaiHoc> arrayList;

    public ThemTrangTu(ArrayList<BaiHoc> arrayList) {
        this.arrayList = arrayList;
        add();
    }

    private void add() {
        arrayList.add(new BaiHoc("Vị trí trạng từ", "Cách hình thành trạng từ, vị trí trạng từ", "20.1"));
        arrayList.add(new BaiHoc("Các loại trạng từ", "Các loại trạng từ", "20.2"));
        arrayList.add(new BaiHoc("Phân loại trạng từ", "Trạng từ chỉ cách thức, thời gian, tần suất", "20.3"));
        arrayList.add(new BaiHoc("Các trạng từ thường gặp", "Các trạng từ thường gặp", "20.4"));
    }
}
