package com.trantien.nguphaptienganh.Lesson;

import com.trantien.nguphaptienganh.Model.ItemLession;
import com.trantien.nguphaptienganh.R;

import java.util.ArrayList;

public class Action {
    ArrayList<ItemLession> arrayList;

    public Action(ArrayList<ItemLession> arrayList) {
        this.arrayList = arrayList;
        add();
    }

    private void add() {
        arrayList.add(new ItemLession(0, "Carry", "Mang", R.raw.sound_carry));
        arrayList.add(new ItemLession(1, "Crawl", "Bò", R.raw.sound_crawl));
        arrayList.add(new ItemLession(2, "Crouch", "Ngồi Co Lại", R.raw.sound_crouch));
        arrayList.add(new ItemLession(3, "Dive", "Lặn", R.raw.sound_dive));
        arrayList.add(new ItemLession(4, "Hit", "Đánh", R.raw.sound_hit));
        arrayList.add(new ItemLession(5, "Hold", "Giữ", R.raw.sound_hold));
        arrayList.add(new ItemLession(6, "Jump", "Nhảy", R.raw.sound_jump));
        arrayList.add(new ItemLession(7, "Kick", "Đá", R.raw.sound_kick));
        arrayList.add(new ItemLession(8, "Lift", "Nâng", R.raw.sound_lift));
        arrayList.add(new ItemLession(9, "Pick Up", "Nhặt lên", R.raw.sound_pickup));
        arrayList.add(new ItemLession(10, "Pull", "Kéo", R.raw.sound_pull));
        arrayList.add(new ItemLession(11, "Push", "Đẩy", R.raw.sound_push));
        arrayList.add(new ItemLession(12, "Run", "Chạy", R.raw.sound_run));
        arrayList.add(new ItemLession(13, "Sit", "Ngồi", R.raw.sound_sit));
        arrayList.add(new ItemLession(14, "Throw", "Ném", R.raw.sound_throw));
        arrayList.add(new ItemLession(15, "Walk", "Đi Bộ", R.raw.sound_walk));
        arrayList.add(new ItemLession(16, "Punch,", "Đấm", R.raw.sound_punch));
        arrayList.add(new ItemLession(17, "Sprinklers,", "Tưới nước", R.raw.sound_sprinklers));
        arrayList.add(new ItemLession(18, "Do exercise,", "Tập thể dục", R.raw.sound_doexercise));
        arrayList.add(new ItemLession(19, "Fly a kite,", "Thả Diều", R.raw.sound_flyakite));
    }
}
