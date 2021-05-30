package com.trantien.nguphaptienganh.Lesson.TrangTu;

import com.trantien.nguphaptienganh.Model.ItemLession;
import com.trantien.nguphaptienganh.R;

import java.util.ArrayList;

public class NhungCauHoiThongThuong {
    ArrayList<ItemLession> arrayList;

    public NhungCauHoiThongThuong(ArrayList<ItemLession> arrayList) {
        this.arrayList = arrayList;
        add();
    }

    private void add() {
        arrayList.add(new ItemLession(0, "how?", "thế nào?", R.raw.sound_carry));
        arrayList.add(new ItemLession(1, "question", "câu hỏi", R.raw.sound_crawl));
        arrayList.add(new ItemLession(2, "What?", "cái gì?", R.raw.sound_crouch));
        arrayList.add(new ItemLession(3, "When?", "khi nào?", R.raw.sound_dive));
        arrayList.add(new ItemLession(4, "Where", "ở đâu?", R.raw.sound_hit));
        arrayList.add(new ItemLession(5, "Which?", "cái nào?", R.raw.sound_hold));
        arrayList.add(new ItemLession(6, "Which?", "người nào?", R.raw.sound_jump));
        arrayList.add(new ItemLession(7, "Who?", "ai?", R.raw.sound_kick));
        arrayList.add(new ItemLession(8, "Why?", "tại sao?", R.raw.sound_lift));
        arrayList.add(new ItemLession(9, "boss", "chủ", R.raw.sound_pickup));
    }
}
