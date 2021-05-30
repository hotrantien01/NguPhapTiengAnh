package com.trantien.nguphaptienganh.Lesson;

import com.trantien.nguphaptienganh.Model.ItemLession;
import com.trantien.nguphaptienganh.R;

import java.util.ArrayList;

public class ThanhNguThongDung {
    ArrayList<ItemLession> arrayList;

    public ThanhNguThongDung(ArrayList<ItemLession> arrayList) {
        this.arrayList = arrayList;
        add();
    }

    private void add() {
        arrayList.add(new ItemLession(0, "again", "lại, một lần nữa", R.raw.sound_carry));
        arrayList.add(new ItemLession(1, "almost", "hầu như", R.raw.sound_crawl));
        arrayList.add(new ItemLession(2, "already", "rồi", R.raw.sound_crouch));
        arrayList.add(new ItemLession(3, "alright", "được", R.raw.sound_dive));
        arrayList.add(new ItemLession(4, "also", "cũng", R.raw.sound_hit));
        arrayList.add(new ItemLession(5, "always", "luôn luôn", R.raw.sound_hold));
        arrayList.add(new ItemLession(6, "and", "và", R.raw.sound_jump));
        arrayList.add(new ItemLession(7, "angry", "giận dữ", R.raw.sound_kick));
        arrayList.add(new ItemLession(8, "animal", "thú vật", R.raw.sound_lift));
        arrayList.add(new ItemLession(9, "another", "một...khác", R.raw.sound_pickup));
        arrayList.add(new ItemLession(10, "common", "chung", R.raw.sound_pull));
        arrayList.add(new ItemLession(11, "complete", "đầy đủ", R.raw.sound_push));
    }
}
