package com.trantien.nguphaptienganh.CacBaiHoc;

import com.trantien.nguphaptienganh.Model.BaiHoc;

import java.util.ArrayList;

public class ThemThi {
    ArrayList<BaiHoc> arrayList;

    public ThemThi(ArrayList<BaiHoc> arrayList) {
        this.arrayList = arrayList;
        add();
    }

    private void add(){
        arrayList.add(new BaiHoc("Hiện tại đơn","Present simple","1.1"));
        arrayList.add(new BaiHoc("Hiện tại tiếp diễn","Present continuous","1.2"));
        arrayList.add(new BaiHoc("Hiện tại hoàn thành","Present perfect","1.3"));
        arrayList.add(new BaiHoc("Hiện tại hoàn thành tiếp diễn","Present perfect continuous","1.4"));
        arrayList.add(new BaiHoc("Quá khứ đơn","Simple past","1.5"));
        arrayList.add(new BaiHoc("Quá khứ tiếp diễn","Past continuous","1.6"));
        arrayList.add(new BaiHoc("Quá khứ hoàn thành","Past perfect","1.7"));
        arrayList.add(new BaiHoc("Quá khứ hoàn thành tiếp diễn","Past perfect continuous","1.8"));
        arrayList.add(new BaiHoc("Tương lai đơn","Simple future","1.9"));
        arrayList.add(new BaiHoc("Tương lai tiếp diễn","Future continuous","1.10"));
        arrayList.add(new BaiHoc("Tương lai hoàn thành","Future perfect","1.11"));
        arrayList.add(new BaiHoc("Tương lai hoàn thành tiếp diễn","Future perfect continuous","1.12"));
    }
}
