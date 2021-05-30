package com.trantien.nguphaptienganh.Lesson;

import com.trantien.nguphaptienganh.Model.ItemLession;
import com.trantien.nguphaptienganh.R;

import java.util.ArrayList;


public class ViecLam {
    ArrayList<ItemLession> arrayList;

    public ViecLam(ArrayList<ItemLession> arrayList) {
        this.arrayList = arrayList;
        add();
    }

    private void add() {
        arrayList.add(new ItemLession(0, "class", "lớp học", R.raw.sound_carry));
        arrayList.add(new ItemLession(1, "course", "khóa học", R.raw.sound_crawl));
        arrayList.add(new ItemLession(2, "co-worker", "đồng nghiệp", R.raw.sound_crouch));
        arrayList.add(new ItemLession(3, "degree", "độ", R.raw.sound_dive));
        arrayList.add(new ItemLession(4, "dry", "khô", R.raw.sound_hit));
        arrayList.add(new ItemLession(5, "effort", "nổ lực", R.raw.sound_hold));
        arrayList.add(new ItemLession(6, "equal", "bằng", R.raw.sound_jump));
        arrayList.add(new ItemLession(7, "factory", "xưởng", R.raw.sound_kick));
        arrayList.add(new ItemLession(8, "job", "việc làm", R.raw.sound_lift));
        arrayList.add(new ItemLession(9, "manager", "giám đốc", R.raw.sound_pickup));
        arrayList.add(new ItemLession(10, "muscle", "bắp thịt", R.raw.sound_pull));
        arrayList.add(new ItemLession(11, "schedule", "thời biểu", R.raw.sound_push));
        arrayList.add(new ItemLession(12, "scientist", "nhà khoa học", R.raw.sound_run));
        arrayList.add(new ItemLession(13, "skill", "kỹ năng", R.raw.sound_sit));
        arrayList.add(new ItemLession(14, "stapler", "cái dập ghim", R.raw.sound_throw));
        arrayList.add(new ItemLession(15, "team", "đội", R.raw.sound_walk));
        arrayList.add(new ItemLession(16, "tool,", "dụng cụ", R.raw.sound_punch));
        arrayList.add(new ItemLession(17, "work,", "làm việc", R.raw.sound_sprinklers));
        arrayList.add(new ItemLession(18, "workplace,", "nơi làm việc", R.raw.sound_doexercise));
        arrayList.add(new ItemLession(19, "air,", "không khí", R.raw.sound_flyakite));
    }
}
