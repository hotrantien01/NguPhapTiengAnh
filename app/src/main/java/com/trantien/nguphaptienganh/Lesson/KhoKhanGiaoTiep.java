package com.trantien.nguphaptienganh.Lesson;

import com.trantien.nguphaptienganh.Model.ItemLession;
import com.trantien.nguphaptienganh.R;

import java.util.ArrayList;

public class KhoKhanGiaoTiep {
    ArrayList<ItemLession> arrayList;

    public KhoKhanGiaoTiep(ArrayList<ItemLession> arrayList) {
        this.arrayList = arrayList;
        add();
    }

    private void add() {
        arrayList.add(new ItemLession(0, "color", "màu", R.raw.sound_carry));
        arrayList.add(new ItemLession(1, "complicated", "phức tạp", R.raw.sound_crawl));
        arrayList.add(new ItemLession(2, "dictionnary", "từ điển", R.raw.sound_crouch));
        arrayList.add(new ItemLession(3, "false", "giả", R.raw.sound_dive));
        arrayList.add(new ItemLession(4, "fluent", "trôi chảy", R.raw.sound_hit));
        arrayList.add(new ItemLession(5, "interrupt", "chặn ngang", R.raw.sound_hold));
        arrayList.add(new ItemLession(6, "language", "ngôn ngữ", R.raw.sound_jump));
        arrayList.add(new ItemLession(7, "letter", "mẫu tự", R.raw.sound_kick));
        arrayList.add(new ItemLession(8, "mean", "có nghĩa", R.raw.sound_lift));
        arrayList.add(new ItemLession(9, "mistake", "lỗi", R.raw.sound_pickup));
        arrayList.add(new ItemLession(10, "problem", "vấn đề", R.raw.sound_pull));
        arrayList.add(new ItemLession(11, "pronunciation", "phát âm", R.raw.sound_push));
        arrayList.add(new ItemLession(12, "strange", "lạ", R.raw.sound_run));
        arrayList.add(new ItemLession(13, "terrible", "khủng khiếp", R.raw.sound_sit));
        arrayList.add(new ItemLession(14, "word", "chữ", R.raw.sound_throw));
        arrayList.add(new ItemLession(15, "accident", "tai nạn", R.raw.sound_walk));
    }
}
