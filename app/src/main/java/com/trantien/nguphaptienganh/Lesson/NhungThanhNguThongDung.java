package com.trantien.nguphaptienganh.Lesson;

import com.trantien.nguphaptienganh.Model.ItemLession;
import com.trantien.nguphaptienganh.R;

import java.util.ArrayList;

public class NhungThanhNguThongDung {
    ArrayList<ItemLession> arrayList;

    public NhungThanhNguThongDung(ArrayList<ItemLession> arrayList) {
        this.arrayList = arrayList;
        add();
    }

    private void add() {
        arrayList.add(new ItemLession(0, "actually", "thực sự", R.raw.sound_carry));
        arrayList.add(new ItemLession(1, "anything", "bất cứ cái gì", R.raw.sound_crawl));
        arrayList.add(new ItemLession(2, "are", "là", R.raw.sound_crouch));
        arrayList.add(new ItemLession(3, "at", "tại", R.raw.sound_dive));
        arrayList.add(new ItemLession(4, "bad", "dở", R.raw.sound_hit));
        arrayList.add(new ItemLession(5, "badly", "một cách tệ", R.raw.sound_hold));
        arrayList.add(new ItemLession(6, "because", "bởi vì", R.raw.sound_jump));
        arrayList.add(new ItemLession(7, "beginner", "người bắt đầu", R.raw.sound_kick));
        arrayList.add(new ItemLession(8, "beside", "bên cạnh", R.raw.sound_lift));
        arrayList.add(new ItemLession(9, "best", "tốt nhất", R.raw.sound_pickup));
        arrayList.add(new ItemLession(10, "better", "tốt hơn", R.raw.sound_pull));
        arrayList.add(new ItemLession(11, "big", "lớn", R.raw.sound_push));
        arrayList.add(new ItemLession(12, "bird", "chim", R.raw.sound_run));
        arrayList.add(new ItemLession(13, "black", "đen", R.raw.sound_sit));
        arrayList.add(new ItemLession(14, "blue", "xanh dương", R.raw.sound_throw));
        arrayList.add(new ItemLession(15, "book", "sách", R.raw.sound_walk));
        arrayList.add(new ItemLession(16, "both", "cả hai", R.raw.sound_walk));
        arrayList.add(new ItemLession(17, "brown", "nâu", R.raw.sound_walk));
        arrayList.add(new ItemLession(18, "but", "nhưng", R.raw.sound_walk));
        arrayList.add(new ItemLession(19, "carefully", "một cách cẩn thận", R.raw.sound_walk));
        arrayList.add(new ItemLession(20, "cat", "mèo", R.raw.sound_walk));
        arrayList.add(new ItemLession(21, "certainly", "dĩ nhiên", R.raw.sound_walk));
        arrayList.add(new ItemLession(22, "chance", "cơ hội", R.raw.sound_walk));
        arrayList.add(new ItemLession(23, "clean", "lau chùi", R.raw.sound_walk));
        arrayList.add(new ItemLession(24, "correct", "đúng", R.raw.sound_crawl));
    }
}
