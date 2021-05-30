package com.trantien.nguphaptienganh.CacBaiHoc;

import com.trantien.nguphaptienganh.Model.BaiHoc;

import java.util.ArrayList;

public class ThemCongThucVietLaiCau {
    ArrayList<BaiHoc> arrayList;

    public ThemCongThucVietLaiCau(ArrayList<BaiHoc> arrayList) {
        this.arrayList = arrayList;
        add();
    }

    private void add() {
        arrayList.add(new BaiHoc("Phần 1", "Tổng hợp công thức viết lại câu phần 1", "13.1"));
        arrayList.add(new BaiHoc("Phần 2", "Tổng hợp công thức viết lại câu phần 2", "13.2"));
        arrayList.add(new BaiHoc("Phần 3", "Tổng hợp công thức viết lại câu phần 3", "13.3"));
        arrayList.add(new BaiHoc("Phần 4", "Tổng hợp công thức viết lại câu phần 4", "13.4"));
    }
}
