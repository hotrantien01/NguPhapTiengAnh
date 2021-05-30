package com.trantien.nguphaptienganh.CacBaiHoc;

import com.trantien.nguphaptienganh.Model.BaiHoc;

import java.util.ArrayList;

public class ThemTinhTu {
    ArrayList<BaiHoc> arrayList;

    public ThemTinhTu(ArrayList<BaiHoc> arrayList) {
        this.arrayList = arrayList;
        add();
    }

    private void add() {
        arrayList.add(new BaiHoc("Vị trí tính từ", "Vị trí tính từ, cách sử dụng như danh từ", "19.1"));
        arrayList.add(new BaiHoc("Tính từ tận cùng bằng \"ing\" và \"ed\"", "Ý nghĩa của tính từ đuôi \"ing\" và \"ed\"", "19.2"));
        arrayList.add(new BaiHoc("Tính từ kép/ghép", "Cách viết, cấu tạo", "19.3"));
        arrayList.add(new BaiHoc("Cấu trúc trật tự tính từ", "Cấu trúc trật tự tính từ", "19.4"));
        arrayList.add(new BaiHoc("Các tính từ thường gặp", "Các tính từ thường gặp", "19.5"));
    }
}
