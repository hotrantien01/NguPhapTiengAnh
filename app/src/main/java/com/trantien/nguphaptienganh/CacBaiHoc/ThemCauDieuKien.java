package com.trantien.nguphaptienganh.CacBaiHoc;

import com.trantien.nguphaptienganh.Model.BaiHoc;

import java.util.ArrayList;

public class ThemCauDieuKien {
    ArrayList<BaiHoc> arrayList;

    public ThemCauDieuKien(ArrayList<BaiHoc> arrayList) {
        this.arrayList = arrayList;
        add();
    }

    private void add() {
        arrayList.add(new BaiHoc("Câu điều kiện loại 1", "Khái niệm, công thức, cách dùng câu điều kiện", "5.1"));
        arrayList.add(new BaiHoc("Câu điều kiện loại 2", "Khái niệm, công thức, cách dùng câu điều kiện", "5.2"));
        arrayList.add(new BaiHoc("Câu điều kiện loại 3", "Khái niệm, công thức, cách dùng câu điều kiện", "5.3"));
        arrayList.add(new BaiHoc("Câu điều kiện dạng đảo ngữ", "Đảo ngữ câu điều kiện loại 1, 2, 3", "5.4"));
        arrayList.add(new BaiHoc("Câu điều kiện dạng đặc biệt", "Các loại đặc biệt", "5.5"));
    }
}
