package com.trantien.nguphaptienganh.Lesson;

import com.trantien.nguphaptienganh.Model.ItemLession;
import com.trantien.nguphaptienganh.R;

import java.util.ArrayList;


public class DienThoaiThuInternet {
    ArrayList<ItemLession> arrayList;

    public DienThoaiThuInternet(ArrayList<ItemLession> arrayList) {
        this.arrayList = arrayList;
        add();
    }

    private void add() {
        arrayList.add(new ItemLession(0, "card", "thẻ", R.raw.sound_carry));
        arrayList.add(new ItemLession(1, "computer", "máy vi tính", R.raw.sound_crawl));
        arrayList.add(new ItemLession(2, "cord", "dây", R.raw.sound_crouch));
        arrayList.add(new ItemLession(3, "delete", "xóa", R.raw.sound_dive));
        arrayList.add(new ItemLession(4, "email", "thư điện tử", R.raw.sound_hit));
        arrayList.add(new ItemLession(5, "envelope", "phong bì", R.raw.sound_hold));
        arrayList.add(new ItemLession(6, "fax", "bản phắc", R.raw.sound_jump));
        arrayList.add(new ItemLession(7, "information", "thông tin", R.raw.sound_kick));
        arrayList.add(new ItemLession(8, "Internet", "internet", R.raw.sound_lift));
        arrayList.add(new ItemLession(9, "letter", "lá thư", R.raw.sound_pickup));
        arrayList.add(new ItemLession(10, "mail", "thư tín", R.raw.sound_pull));
        arrayList.add(new ItemLession(11, "package", "gói", R.raw.sound_push));
        arrayList.add(new ItemLession(12, "page", "trang", R.raw.sound_run));
        arrayList.add(new ItemLession(13, "password", "khẩu lệnh", R.raw.sound_sit));
        arrayList.add(new ItemLession(14, "pen", "bút mực", R.raw.sound_throw));
        arrayList.add(new ItemLession(15, "phone", "điện thoại", R.raw.sound_walk));
        arrayList.add(new ItemLession(16, "postcard", "bưu thiếp", R.raw.sound_walk));
        arrayList.add(new ItemLession(17, "shirt", "áo sơ mi", R.raw.sound_walk));
        arrayList.add(new ItemLession(18, "software", "phần mềm", R.raw.sound_walk));
        arrayList.add(new ItemLession(19, "stamp", "tem", R.raw.sound_walk));
        arrayList.add(new ItemLession(20, "type", "đánh máy", R.raw.sound_walk));
        arrayList.add(new ItemLession(21, "website", "trang web", R.raw.sound_walk));
        arrayList.add(new ItemLession(22, "after", "sau", R.raw.sound_walk));
    }
}
