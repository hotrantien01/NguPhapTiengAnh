package com.trantien.nguphaptienganh.Lesson;

import com.trantien.nguphaptienganh.Model.ItemLession;
import com.trantien.nguphaptienganh.R;

import java.util.ArrayList;

public class ChaoHoi {
    ArrayList<ItemLession> arrayList;

    public ChaoHoi(ArrayList<ItemLession> arrayList) {
        this.arrayList = arrayList;
        add();
    }

    private void add() {
        arrayList.add(new ItemLession(0, "goodbye", "tạm biệt", R.raw.sound_carry));
        arrayList.add(new ItemLession(1, "hello", "chào", R.raw.sound_crawl));
        arrayList.add(new ItemLession(2, "name", "tên", R.raw.sound_crouch));
        arrayList.add(new ItemLession(3, "please", "làm ơn", R.raw.sound_dive));
        arrayList.add(new ItemLession(4, "surprise", "gây ngạc nhiên", R.raw.sound_hit));
        arrayList.add(new ItemLession(5, "about", "về", R.raw.sound_hold));
    }
}
